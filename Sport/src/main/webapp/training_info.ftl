<html lang="en>

<head>
    <#include "main.ftl">

    <#macro title>Trainings</#macro>
    <link rel="stylesheet">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"/>
<meta name="robots" content="noindex,nofollow"/>
<link href="start_page_main_80f290cc155f9f410e82.css" rel="stylesheet"/>

<style>
    body {font-family: Arial, Helvetica, sans-serif;}
    * {box-sizing: border-box;}

    input[type=text], select, textarea {
        width: 100%;
        padding: 12px;
        border: 1px solid black;
        border-radius: 4px;
        box-sizing: border-box;
        margin-top: 6px;
        margin-bottom: 16px;
        resize: vertical;
    }

    input[type=submit] {
        background-color: royalblue;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: royalblue;
    }

    .container {
        border-radius: 5px;
        background-color: black;
        padding: 20px;
    }
</style>

</head>
<body style="background-color:black;">

<#macro content>

    <h1 class="text-center text-white">
        <br><br><br>
        <font size="+5">${training.name}
    </h1>

    <#list exercices as e>
        <h1 class="text-center text-white">
            <br>
            <font size="+2">${e?index+1}  ${e.name}  ${e.descryption}
        </h1>
    </#list>

    <div class="container" >
        <br><br>
        <form method="post">
            <label for="comment">Leave a comment</label>
            <input type="text" id="comment" name="comment" placeholder="Comment...">
            <input type="submit" value="Комментировать">
        </form>
    </div>

    <#list com as e>
        <h1 class="text-center text-white">
            <br>
            <font size="+2"> ${e.author_id}
            <font size="+1"> ${e.value}
        </h1>
    </#list>

</#macro>
</body>

</html>