const btn = document.getElementById('enviar');
const input = document.getElementById('barra-pesquisa');

btn.addEventListener('click', buscar);
input.addEventListener('keypress', function(e) {
    if (e.key === 'Enter') buscar();
});

// Cria o painel de resultados uma vez
const painel = document.createElement('div');
painel.id = 'painel-busca';
painel.style.cssText = `
    display: none;
    position: fixed;
    top: 80px;
    right: 20px;
    background: #fff;
    border: 1px solid #ddd;
    border-top: 3px solid #fe1010;
    border-radius: 8px;
    box-shadow: 4px 4px 16px rgba(0,0,0,0.15);
    width: 280px;
    z-index: 9999;
    font-family: Arial, sans-serif;
    max-height: 400px;
    overflow-y: auto;
`;
document.body.appendChild(painel);

function buscar() {
    const termo = input.value.toLowerCase().trim();
    if (termo === '') return;

    // Limpa destaques anteriores
    document.querySelectorAll('[data-destacado]').forEach(function(el) {
        el.style.outline = 'none';
        el.removeAttribute('data-destacado');
    });
    painel.style.display = 'none';

    // Busca apenas em elementos "folha" com texto relevante
    const alvos = document.querySelectorAll('h1, h2, h3, p, .card-destaque');
    const encontrados = [];

    alvos.forEach(function(el) {
        // Evita pegar pais que já contêm filhos encontrados
        const textoDirecto = Array.from(el.childNodes)
            .filter(n => n.nodeType === 3)
            .map(n => n.textContent)
            .join('') + el.innerText;

        if (textoDirecto.toLowerCase().includes(termo)) {
            encontrados.push(el);
            el.style.outline = '3px solid #fe1010';
            el.setAttribute('data-destacado', '1');
        }
    });

    if (encontrados.length === 0) {
        alert('Nenhum resultado para "' + input.value + '"');
        return;
    }

    if (encontrados.length === 1) {
        encontrados[0].scrollIntoView({ behavior: 'smooth', block: 'center' });
        return;
    }

    // Mais de um: monta o painel
    let indice = 0;

    function irPara(i) {
        indice = i;
        encontrados[i].scrollIntoView({ behavior: 'smooth', block: 'center' });

        // Destaca o atual em laranja, os outros em vermelho
        encontrados.forEach(function(el, j) {
            el.style.outline = j === i ? '1px solid orange' : '1px solid #fe1010';
        });

        // Atualiza contador no painel
        document.getElementById('busca-contador').textContent =
            (i + 1) + ' de ' + encontrados.length;
    }
    window.irPara = irPara;
    painel.innerHTML = `
        <div style="padding: 12px 16px; border-bottom: 1px solid #eee; display: flex; justify-content: space-between; align-items: center;">
            <strong style="color: #1a1a1a; font-size: 0.9rem;">
                ${encontrados.length} resultados para "<em>${input.value}</em>"
            </strong>
            <button onclick="document.getElementById('painel-busca').style.display='none'"
                style="background:none; border:none; font-size:1.1rem; cursor:pointer; color:#777;">✕</button>
        </div>
        <div style="padding: 10px 16px; display: flex; align-items: center; gap: 10px; border-bottom: 1px solid #eee;">
            <button id="busca-ant" style="background:#fe1010; color:#fff; border:none; border-radius:6px; padding:6px 14px; cursor:pointer; font-size:0.85rem;">← Ant.</button>
            <span id="busca-contador" style="font-size:0.85rem; color:#555;">1 de ${encontrados.length}</span>
            <button id="busca-prox" style="background:#fe1010; color:#fff; border:none; border-radius:6px; padding:6px 14px; cursor:pointer; font-size:0.85rem;">Próx. →</button>
        </div>
        <ul style="list-style:none; margin:0; padding:8px 0;">
            ${encontrados.map(function(el, i) {
                const label = el.innerText.trim().substring(0, 60) + (el.innerText.length > 60 ? '…' : '');
                return `<li>
                    <button onclick="irPara(${i})" style="
                        width:100%; text-align:left; background:none; border:none;
                        padding: 8px 16px; cursor:pointer; font-size:0.82rem;
                        color:#333; border-bottom: 1px solid #f0f0f0;
                        transition: background 0.15s;
                    " onmouseover="this.style.background='#fe101015'"
                       onmouseout="this.style.background='none'">
                        <span style="color:#fe1010; font-weight:bold; margin-right:6px;">${i + 1}.</span>${label}
                    </button>
                </li>`;
            }).join('')}
        </ul>
    `;

    painel.style.display = 'block';
    irPara(0);

    document.getElementById('busca-prox').addEventListener('click', function() {
        irPara((indice + 1) % encontrados.length);
    });
    document.getElementById('busca-ant').addEventListener('click', function() {
        irPara((indice - 1 + encontrados.length) % encontrados.length);
    });
}

// Apague as últimas 4 linhas do código acima e coloque isso:
let irParaGlobal;
// (irParaGlobal é atribuído dentro de buscar(), então o onclick do painel sempre usa a versão atual)