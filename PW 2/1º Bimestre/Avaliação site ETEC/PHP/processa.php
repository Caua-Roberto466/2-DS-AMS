<?php
$nome = $_POST["nome"];
$email = $_POST["email"];
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../CSS/style.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css" rel="stylesheet" /> 
    <title>Processo</title>
    <style>
        .article{
            width: 50%;
            border: 2px solid #fe1010;
            margin: auto;
            border-radius: 15px;
            padding: 8px;
        }
        .article p{
            font-size: 150%;
            font-family: Arial;
        }
    </style>
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

    <h1><?php echo"Mensagem enviada"; ?></h1>

    <article class="article">
        <p><?php echo"Olá $nome do email $email, sua mensagem foi enviada com sucesso, aguarde um momento e logo enviaremos a resposta para seu email";?></p>
    </article>

    <footer>
        <h2>&copy;<?php echo "ETEC Zona Leste";?></h2>
    </footer>
</body>
</html>