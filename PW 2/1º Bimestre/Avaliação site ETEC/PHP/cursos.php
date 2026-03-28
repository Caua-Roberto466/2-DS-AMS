<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../CSS/style.css">
    <link rel="stylesheet" href="../CSS/cursos.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css" rel="stylesheet" />  
    <title>Cursos</title>
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
                        <a href="index.php" class="link-empresa"><?php echo "Home";?></a>
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

    <h1><?php echo"Venha conhecer nosso curso"; ?></h1>

    <section class="tec">
        <div class="container-cursos">
            <article class="curso ds">
                <img src="../IMG/ds.png" alt="Homem programando">
                <p>
                    <?php echo"<strong>Desenvolvimento de sistema:</strong> Um curso que ensina jovens alunos a prgramar seguido de excelentes professores"; ?>
                </p>
            </article>
            <article class="curso eletronica">
                <img src="../IMG/eletronica.png" alt="Componetes eletronicos">
                <p>
                    <?php echo"<strong>Eletrônica:</strong> Um curso que ensina como usar componentes para construir relógios, robôs, projetos de cidades entre outros"; ?>
                </p>
            </article>
            <article class="curso seguranca-digital">
                <img src="../IMG/Seguranca-digital.png" alt="Homem programando">
                <p>
                    <?php echo"<strong>Eletrônica:</strong> Um curso que ensina como usar componentes para construir relógios, robôs, projetos de cidades entre outros"; ?>
                </p>
            </article>
        </div>
        <div class="container-cursos">
            <article class="curso">
                <img src="../IMG/banco-de-dados.jpg" alt="Imagem de um data center">
                <p>
                    <?php echo"<strong>Adiministrador de banco de dados:</strong> Um curso que ensina estudantes a adimnistrar banco de dados que gerenciam centenas de clientes"; ?>
                </p>
            </article>
            <article class="curso">
                <img src="../IMG/redes_de_computadores.png" alt="Imagem de um sistema de rede">
                <p>
                    <?php echo"<strong>Redes de Computadores:</strong> Um curso para aprender a criar redes cabeadas e Wi-Fi sem precisar da Claro ou da Vivo"; ?>
                </p>
            </article>
            <article class="curso">
                <img src="../IMG/energia-renovavel.png" alt="Imagem de um centro de energia eólica">
                <p>
                    <?php echo"<strong>Sistema de energia renovável:</strong> Venha aprender novas formas de se produzir uma energia limp, que não polua o planeta, nem que sofra de escassez"; ?>
                </p>
            </article>
        </div>
    </section>

    <section class="mais-info">
        <p>
            Os cursos da etec são pensados em como podemos garantir o melhor ensino para nossos alunos, alunos esses de todas as regiões do estado.
            <br>
            Para se matricular em um curso basta se inscrever para o vestibulinho, uma prova com 40 questões que ira classificar se vocês está apto ou não para entrar na etec.
            <br>
            Após fazer a prova e ter passado, você irá se dirigir até a unidade escolhida e iniciará seus estudos.
        </p>
    </section>

    <footer>
        <h2>&copy;<?php echo "ETEC Zona Leste";?></h2>
    </footer>
</body>
</html>