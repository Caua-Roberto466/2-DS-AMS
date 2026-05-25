
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <?php
    $hora = $_POST['horas'];
    $valor = $_POST['valor'];
    $salario = $hora * $valor;

    echo "<h2>De acordo com seu trabalho de $hora mensais e com o valor de R$$valor, você recebe R$$salario</h2>";
    ?>
</body>
</html>