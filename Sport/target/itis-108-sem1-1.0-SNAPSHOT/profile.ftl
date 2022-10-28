<html lang="en>

<head>
    <#include "main.ftl">

    <#macro title>Home</#macro>
    <link rel="stylesheet">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"/>
<meta name="robots" content="noindex,nofollow"/>
<link href="start_page_main_80f290cc155f9f410e82.css" rel="stylesheet"/>

</head>
<body style="background-color:black;">

<#macro content>

    <h1 class="text-center text-white">
        <br>
        <font size="+5">${user.name} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+5">${user.email} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Gender: ${user.gender} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Goal: ${user.goal} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Form: ${user.form} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Age: ${user.age} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Height: ${user.height} <br>
    </h1>
    <h1 class="text-center text-white">
        <br>
        <font size="+4">Weight: ${user.weight} <br>
    </h1>

</#macro>
</body>

</html>