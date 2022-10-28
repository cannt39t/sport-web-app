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

</head>
<body style="background-color:black;">

<#macro content>

    <form action="trainings" method="post" id="form">
        <select name="genreFilter" id="genreFilter">
            <option value="All">All</option>
            <option value="Light">Light</option>
            <option value="Medium">Medium</option>
            <option value="Hard">Hard</option>
        </select>
        <input class="button" type="submit" value="Filter" style="background-color:white;">
    </form>
        <#list trainings as t>
            <br><br><br><br>
            <div class="layout">
                <div class="page">
                    <div class="auth-content">
                        <div class="auth-content-main">
                            <form id="kc-form-login" class="mb-2" action="/training?trainingId=${t.id}" method="post">
                                <div id="kc-content-wrapper" >
                                    <div class="content-title">
                                        <font +5>
                                            <div class="title">${t.name}</div>
                                        </font>
                                    </div>
                                    <br>
                                    <div class="content-title">
                                        <div class="title">Approaches: ${t.approaches}</div>
                                    </div>
                                    <div class="content-title">
                                        <div class="title">Complexity: ${t.complexity}</div>
                                    </div>

                                    <div class="content-title title text-white text-center" style="background-color:black;">
                                        <a href="/training?trainingId=${t.id}">Открыть тренировку</a>
                                    </div>

                                    <div class="content-main-section">
                                        <div id="error_username" class="error-message invisible"></div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </#list>


</#macro>
</body>

</html>