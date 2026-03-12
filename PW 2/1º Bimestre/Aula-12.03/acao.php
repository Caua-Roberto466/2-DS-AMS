<?php 
$nome = $_POST["nome"];
$idade = $_POST["idade"];
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ação de PHP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <p><?php echo "Olá $nome, você tem $idade";?></p>
</body>
</html>