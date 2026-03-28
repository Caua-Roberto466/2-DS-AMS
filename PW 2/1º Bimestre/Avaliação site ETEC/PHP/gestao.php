<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../CSS/style.css">
    <link rel="stylesheet" href="../CSS/gestao.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css" rel="stylesheet" />
    <title>Gestão</title>
    
</head>
<body>

    <!-- ===================== HEADER ===================== -->
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
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Home"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Sobre nós"; ?></a></li>
                <li class="link-ul"><a href="contato.php" class="link-empresa"><?php echo "Contato"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Eventos"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Feiras"; ?></a></li>
                <li class="link-ul"><a href="cursos.php" class="link-empresa"><?php echo "Cursos"; ?></a></li>
                <li class="link-ul"><a href="gestao.php" class="link-empresa"><?php echo "Gestão"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Locais"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Cursos AMS"; ?></a></li>
                <li class="link-ul"><a href="#" class="link-empresa"><?php echo "Graduação"; ?></a></li>
                <li class="link-ul"><a href="https://www.cps.sp.gov.br/" target="_blank" class="link-empresa"><?php echo "Centro Paula Souza"; ?></a></li>
            </ul>
        </nav>
    </header>

    <!-- ===================== TÍTULO ===================== -->
    <p class="breadcrumb">Home &rsaquo; <span>Gestão</span></p>
    <h1><?php echo "Conheça a gestão de nossas escolas"; ?></h1>

    <!-- ===================== DIREÇÃO ===================== -->
    <section class="direcao">
        <p class="section-label"><?php echo "Equipe"; ?></p>
        <h2 class="section-title"><?php echo "Direção e Coordenação"; ?></h2>

        <div class="container-direcao">

            <!-- Card 1 - Diretora -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "M"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Diretora"; ?></p>
                    <h3 class="card-nome"><?php echo "Maria Aparecida Silva"; ?></h3>
                    <p class="card-descricao"><?php echo "Responsável pela gestão geral da unidade escolar, garantindo o cumprimento das diretrizes educacionais."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:diretoria@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

            <!-- Card 2 - Vice-Diretor -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "C"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Vice-Diretor"; ?></p>
                    <h3 class="card-nome"><?php echo "Carlos Eduardo Moreira"; ?></h3>
                    <p class="card-descricao"><?php echo "Auxilia na administração da escola e coordena as atividades pedagógicas em conjunto com a diretoria."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:vicediretoria@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

            <!-- Card 3 - Coord. Pedagógica -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "A"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Coord. Pedagógica"; ?></p>
                    <h3 class="card-nome"><?php echo "Ana Luiza Ferreira"; ?></h3>
                    <p class="card-descricao"><?php echo "Coordena o planejamento pedagógico e o desenvolvimento curricular dos cursos técnicos oferecidos."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:pedagogico@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

            <!-- Card 4 - Coord. Administrativo -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "R"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Coord. Administrativo"; ?></p>
                    <h3 class="card-nome"><?php echo "Roberto Nascimento"; ?></h3>
                    <p class="card-descricao"><?php echo "Gerencia os recursos administrativos e financeiros, assegurando o bom funcionamento da instituição."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:administrativo@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

            <!-- Card 5 - Coord. de Cursos -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "P"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Coord. de Cursos"; ?></p>
                    <h3 class="card-nome"><?php echo "Patricia Oliveira"; ?></h3>
                    <p class="card-descricao"><?php echo "Acompanha e orienta os cursos técnicos, promovendo a qualidade do ensino e a integração entre docentes."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:cursos@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

            <!-- Card 6 - Orientador Educacional -->
            <div class="card-gestor">
                <div class="card-avatar"><?php echo "F"; ?></div>
                <div class="card-body">
                    <p class="card-cargo"><?php echo "Orientador Educacional"; ?></p>
                    <h3 class="card-nome"><?php echo "Felipe Santos Lima"; ?></h3>
                    <p class="card-descricao"><?php echo "Apoia os alunos em suas trajetórias acadêmicas e profissionais, oferecendo orientação e acompanhamento."; ?></p>
                    <div class="card-contato">
                        <a href="mailto:orientacao@etec.sp.gov.br" title="E-mail"><i class="ri-mail-line"></i></a>
                        <a href="#" title="Telefone"><i class="ri-phone-line"></i></a>
                        <a href="#" title="LinkedIn"><i class="ri-linkedin-box-line"></i></a>
                    </div>
                </div>
            </div>

        </div>
    </section>

    <!-- ===================== ORGANOGRAMA ===================== -->
    <section class="organograma">
        <p class="section-label"><?php echo "Estrutura"; ?></p>
        <h2 class="section-title"><?php echo "Organograma Institucional"; ?></h2>

        <div class="org-wrapper">
            <div class="org-tree">

                <!-- Nível 1 -->
                <div class="org-node">
                    <div class="org-box nivel-1">
                        <?php echo "Diretoria"; ?>
                        <span class="org-sub"><?php echo "Maria Aparecida Silva"; ?></span>
                    </div>
                </div>
                <div class="org-linha-v"></div>

                <!-- Nível 2 -->
                <div class="org-row">
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-2">
                            <?php echo "Vice-Diretoria"; ?>
                            <span class="org-sub"><?php echo "Carlos Eduardo Moreira"; ?></span>
                        </div>
                    </div>
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-2">
                            <?php echo "Coord. Pedagógica"; ?>
                            <span class="org-sub"><?php echo "Ana Luiza Ferreira"; ?></span>
                        </div>
                    </div>
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-2">
                            <?php echo "Coord. Administrativa"; ?>
                            <span class="org-sub"><?php echo "Roberto Nascimento"; ?></span>
                        </div>
                    </div>
                </div>
                <div class="org-linha-v"></div>

                <!-- Nível 3 -->
                <div class="org-row">
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-3"><?php echo "Coord. de Cursos"; ?></div>
                    </div>
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-3"><?php echo "Orientação Educacional"; ?></div>
                    </div>
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-3"><?php echo "Secretaria Acadêmica"; ?></div>
                    </div>
                    <div class="org-col">
                        <div class="org-linha-v"></div>
                        <div class="org-box nivel-3"><?php echo "Setor Financeiro"; ?></div>
                    </div>
                </div>

            </div>
        </div>
    </section>

    <!-- ===================== MISSÃO, VISÃO E VALORES ===================== -->
    <section class="mvv-section">
        <p class="section-label"><?php echo "Institucional"; ?></p>
        <h2 class="section-title"><?php echo "Missão, Visão e Valores"; ?></h2>

        <div class="mvv-grid">
            <div class="mvv-card">
                <div class="mvv-icon"><i class="ri-focus-3-line"></i></div>
                <h3 class="mvv-titulo"><?php echo "Missão"; ?></h3>
                <p class="mvv-texto"><?php echo "Desenvolver pessoas por meio de uma educação profissional e tecnológica de qualidade, promovendo a inclusão social e o desenvolvimento econômico do Estado de São Paulo."; ?></p>
            </div>
            <div class="mvv-card">
                <div class="mvv-icon"><i class="ri-eye-line"></i></div>
                <h3 class="mvv-titulo"><?php echo "Visão"; ?></h3>
                <p class="mvv-texto"><?php echo "Ser reconhecida como referência em educação profissional e tecnológica no Brasil, contribuindo para a formação de profissionais competentes e cidadãos responsáveis."; ?></p>
            </div>
            <div class="mvv-card">
                <div class="mvv-icon"><i class="ri-award-line"></i></div>
                <h3 class="mvv-titulo"><?php echo "Valores"; ?></h3>
                <p class="mvv-texto"><?php echo "Ética, transparência, inovação, respeito à diversidade, comprometimento com a qualidade do ensino e valorização das pessoas."; ?></p>
            </div>
        </div>
    </section>

    <!-- ===================== CONTATO DA GESTÃO ===================== -->
    <section class="contato-gestao">
        <p class="section-label"><?php echo "Fale conosco"; ?></p>
        <h2 class="section-title"><?php echo "Contato com a Gestão"; ?></h2>

        <div class="contato-grid">
            <div class="contato-item">
                <i class="ri-map-pin-2-line"></i>
                <div class="contato-info">
                    <strong><?php echo "Endereço"; ?></strong>
                    <span><?php echo "Rua Exemplo, 123 - Zona Leste, SP"; ?></span>
                </div>
            </div>
            <div class="contato-item">
                <i class="ri-phone-line"></i>
                <div class="contato-info">
                    <strong><?php echo "Telefone"; ?></strong>
                    <span><?php echo "(11) 0000-0000"; ?></span>
                </div>
            </div>
            <div class="contato-item">
                <i class="ri-mail-send-line"></i>
                <div class="contato-info">
                    <strong><?php echo "E-mail"; ?></strong>
                    <span><?php echo "gestao@etec.sp.gov.br"; ?></span>
                </div>
            </div>
            <div class="contato-item">
                <i class="ri-time-line"></i>
                <div class="contato-info">
                    <strong><?php echo "Horário de atendimento"; ?></strong>
                    <span><?php echo "Seg–Sex: 08h às 17h"; ?></span>
                </div>
            </div>
        </div>
    </section>

    <!-- ===================== FOOTER ===================== -->
    <footer>
        <h2>&copy;<?php echo "ETEC Zona Leste"; ?></h2>
    </footer>

</body>
</html>