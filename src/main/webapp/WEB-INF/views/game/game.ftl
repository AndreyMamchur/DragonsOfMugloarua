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
<#if response??>
    ${response}
<#else>
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
<#if dragon??>
    Your dragon!!!
    <table>
        <tr>
            <td>Scale Thickness</td>
            <td id="valueKnight" width="15%">${dragon.scaleThickness}</td>
        </tr>
        <tr>
            <td>Claw Sharpness</td>
            <td id="valueKnight">${dragon.clawSharpness}</td>
        </tr>
        <tr>
            <td>Wing Strength</td>
            <td id="valueKnight">${dragon.wingStrength}</td>
        </tr>
        <tr>
            <td>Fire Breath</td>
            <td id="valueKnight">${dragon.fireBreath}</td>
        </tr>
        <tr>
            <td>
                <form action="startBattle" method="post" class="form-group">
                        <input type="submit" value="Start Battle"/>
                </form>
            </td>
        </tr>
    </table>
    <br>
<#else>
    Prepare a dragon for this battle!<br>
    <#include "createDragonForm.ftl">
</#if>
</div>
</#if>
</body>
</html>