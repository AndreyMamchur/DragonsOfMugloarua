<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Game</title>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" />
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body class="container">

<div id="info">
    Hello my dear, Head of Dragon Resources Management!<br>
    New knigt come in our kingdom. <br> <br>
    <table>
        <tr>
            <td>Name</td>
            <td id="valueKnight">${knight.name}</td>
        </tr>
        <tr>
            <td>Attack</td>
            <td id="valueKnight">${knight.attack}</td>
        </tr>
        <tr>
            <td>Armor</td>
            <td id="valueKnight">${knight.armor}</td>
        </tr>
        <tr>
            <td>Agility</td>
            <td id="valueKnight">${knight.agility}</td>
        </tr>
        <tr>
            <td>Endurance</td>
            <td id="valueKnight">${knight.endurance}</td>
        </tr>
    </table>
    <br>
    Prepare a dragon for this battle!<br>
<#include "createDragonForm.ftl">
</div>

</body>
</html>