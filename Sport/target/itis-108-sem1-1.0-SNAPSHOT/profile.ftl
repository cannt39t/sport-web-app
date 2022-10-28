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

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $(document).on("click", "#ajax-button", function () {
            $.get("/ajax", function (response) {
                $("#ajax-div").text(response);
            })
        }
    )
</script>

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

    <!DOCTYPE html>
    <html>


    <div id="demo">
        <h2 class="text-center text-white">The XMLHttpRequest Object</h2>
        <div class="button-container-div" style="background: white">
            <button type="button" onclick="loadDoc()">Change Content</button>
        </div>
    </div>

    <script>
        function loadDoc() {
            const xhttp = new XMLHttpRequest();
            xhttp.onload = function() {
                document.getElementById("demo").innerHTML =
                    this.responseText;
            }
            xhttp.open("GET", "src/main/webapp/sources/ajax_info.txt");
            xhttp.send();
        }
    </script>


</#macro>
</body>

</html>