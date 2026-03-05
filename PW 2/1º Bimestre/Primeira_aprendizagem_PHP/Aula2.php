<?php
    $nome = "Cauã"; //Cria a variável de nome
    $sobrenome = "Roberto"; //A de sobrenome
    $idade = 16; //Define a idade
    $dataNascimento = "21/04/2009"; //A data de nascimento
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meu Programa PHP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div>
        <h1>Arquivo PHP</h1>
        <p class='para'>
            <?php echo "Meu nome complato é: $nome $sobrenome. 
            <br>E minha idade é: $idade. 
            <br>Minha data de nascimento é $dataNascimento";?>
        </p> <!--Exibe tudo com quebra de linha-->
    </div>
</body>
</html>