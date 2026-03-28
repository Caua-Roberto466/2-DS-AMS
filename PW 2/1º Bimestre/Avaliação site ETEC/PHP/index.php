<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../CSS/style.css">
    <link rel="stylesheet" href="../CSS/index.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css" rel="stylesheet" />   
    <title>ETEC | Centro Paula Souza</title>
</head>
<body>
    <header>
            <div class="container-header">
                <article class="empresa">
                    <img class="logo-header" src="../IMG/logo-etec-300x150.png" alt="Logo da etec, escola de cursos técnicos">
                </article>
                <article class="redes-sociais-header">
                    <i class="ri-instagram-fill icones-header"></i>
                    <i class="ri-facebook-box-fill icones-header"></i>
                    <i class="ri-linkedin-box-fill icones-header"></i>
                    <i class="ri-twitter-x-line icones-header"></i>
                </article>
                <article class="pesquisa">
                    <button id="enviar"><i class="ri-search-line"></i></button>
                    <input type="text" id="barra-pesquisa" placeholder="Pesquise por...">
                </article>
            </div>
            <nav>
                <ul class="lista-links links-empresa">
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Home";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Sobre nós";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="contato.php" class="link-empresa"><?php echo "Contato";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Eventos";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Feiras";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="cursos.php" class="link-empresa"><?php echo "Cursos";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="gestao.php" class="link-empresa"><?php echo "Gestão";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Locais";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Cursos AMS";?></a>
                    </li>
                    <li class="link-ul">
                        <a href="#" class="link-empresa"><?php echo "Graduação";?></a>
                    </li>                    
                    <li class="link-ul">
                        <a href="https://www.cps.sp.gov.br/" target="_blank" class="link-empresa"><?php echo "Centro Paula Souza";?></a>
                    </li>
                </ul>
            </nav>
    </header>
    
    <h1><?php echo"Venha aprender com as melhores escolas do Estado";?></h1>

    <section class="hero">
        <div class="hero-conteudo">
            <span class="hero-tag">ETEC Zona Leste</span>
            <h1><?php echo "Aprenda hoje.<br>Lidere amanhã."; ?></h1>
            <p><?php echo "Cursos técnicos gratuitos com qualidade reconhecida em todo o estado de São Paulo."; ?></p>
            <a href="cursos.php" class="btn-hero"><?php echo "Conheça os cursos"; ?></a>
        </div>
        <div class="hero-destaque">
            <div class="hero-card">
                <span class="hero-numero">+300</span>
                <span class="hero-label">alunos formados por ano</span>
            </div>
            <div class="hero-card">
                <span class="hero-numero">10</span>
                <span class="hero-label">cursos técnicos</span>
            </div>
            <div class="hero-card">
                <span class="hero-numero">+20</span>
                <span class="hero-label">anos de história</span>
            </div>
        </div>
    </section>

    <section class="conquistas">
        <h2><?php echo "Veja nossas conquistas"; ?></h2>
        <article class="popularidade">
            <div class="container-popularidade">
                <article class="img">
                    <img src="../IMG/popularidade-Maker.png" alt="Alunos na sala maker">
                </article>
                <p><?php echo "Nossas escolas abrigam centenas de alunos distribuídos por todo o estado, oferecendo uma infraestrutura adequada e um ambiente propício para o aprendizado e o desenvolvimento pessoal.
                <br><br>
                As ETECs são reconhecidas pela qualidade do ensino técnico e pelo compromisso com a formação completa dos estudantes, unindo teoria e prática de forma eficiente.
                <br><br>
                Nossos cursos formam ótimos profissionais anualmente, preparados para enfrentar os desafios do mercado de trabalho e se destacar em suas áreas de atuação."; ?></p>
            </div>
        </article>
    </section>

    <section class="destaques">
        <h2 class="destaques-titulo"><?php echo "Cursos em destaque"; ?></h2>
        <div class="container-destaques">

            <article class="card-destaque">
                <div class="card-icone">🔌</div>
                <h3><?php echo "Eletrônica"; ?></h3>
                <p><?php echo "Construa robôs, relógios e projetos com componentes eletrônicos."; ?></p>
                <a href="cursos.php" class="card-link"><?php echo "Saiba mais →"; ?></a>
            </article>

            <article class="card-destaque popular">
                <span class="etiqueta"><?php echo "⭐ Mais popular"; ?></span>
                <div class="card-icone">💻</div>
                <h3><?php echo "Desenvolvimento de Sistemas"; ?></h3>
                <p><?php echo "Aprenda a programar do zero com professores experientes e entre no mercado de TI."; ?></p>
                <a href="cursos.php" class="card-link"><?php echo "Saiba mais →"; ?></a>
            </article>

            <article class="card-destaque">
                <div class="card-icone">🌐</div>
                <h3><?php echo "Redes de Computadores"; ?></h3>
                <p><?php echo "Configure redes cabeadas e Wi-Fi e entenda como a internet funciona."; ?></p>
                <a href="cursos.php" class="card-link"><?php echo "Saiba mais →"; ?></a>
            </article>

        </div>
    </section>

    <section class="cta">
        <h2><?php echo "Pronto para começar sua carreira?"; ?></h2>
        <p><?php echo "Inscrições abertas para o próximo semestre. Garanta sua vaga agora."; ?></p>
        <a href="cursos.php" class="btn-cta"><?php echo "Ver todos os cursos"; ?></a>
    </section>

    <footer>
        <h2>&copy;<?php echo "ETEC Zona Leste";?></h2>
    </footer>
    <script src="../JavaScript/barra-pesquisa.js"></script>
</body>
</html>