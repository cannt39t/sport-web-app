<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js">
        </script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js">
        </script>
    </head>
    <head>
        <style>
            .parent {
                /* Parent style. */
            }

            .parent div {
                display: inline;
                /* Child style. */
            }
        </style>

    </head>

    <head>
        <meta name="viewport" content="width=device-width; initial-scale=1">
        <style>
            * {
                box-sizing: border-box;
            }

            body {
                margin: 0;
                font-family: Arial;
                font-size: 17px;
            }

            #myVideo {
                position: fixed;
                width: auto;
                height: auto;
                max-height: 100%;
            }

            .content {
                position: fixed;
                background: rgba(0; 0; 0; 100.0);
                color: #f1f1f1;
                width: 100%;
                padding: 10px;
            }

            #myBtn {
                width: 200px;
                font-size: 18px;
                padding: 10px;
                border: none;
                background: #000;
                color: #fff;
                cursor: pointer;
            }

            #myBtn:hover {
                background: #ddd;
                color: black;
            }
        </style>
        <title></title>
    </head>




</head>

<style>
    .button-container-div {
        text-align: center;
    }
</style>

<body class="button-container-div content" style="background-color:black;">
<br><br>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<form action="userinfo" method="post">

    <div class="d-inline-block">
        <h3>Choose your gender: </h3>
        <label for="gender">
            <select id="gender" name="gender" class="form-control">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
        </label>
    </div>

    <h3>Choose your goal: </h3>
    <label for="goal">
        <select id="goal" name="goal" class="form-control">
            <option value="Lose weight">Lose weight</option>
            <option value="Bulk up">Bulk up</option>
            <option value="Be fit">Be fit</option>
        </select>
    </label>

    <h3>What is your form now? </h3>
    <label for="forma">
        <select id="forma" name="forma" class="form-control">
            <option value="Slim">Slim</option>
            <option value="Average">Average</option>
            <option value="Lush">Lush</option>
        </select>
    </label>

    <h3>What is your name? </h3>
    <label for="name">
        <input type="text" name="name" id="name" class="form-control">
    </label>

    <h3>Your age is: </h3>
    <label for="age">
        <input type="number" name="age" id="age" class="form-control"
               min="6" max="100">
    </label>

    <h3>Indicate your height: </h3>
    <label for="height">
        <input type="number" name="height" id="height" class="form-control"
               min="100" max="250">
    </label>


    <h3>Indicate your weight: </h3>
    <label for="weight">
        <input type="number" name="weight" id="weight" class="form-control"
               min="20" max="300">
    </label>
    <br><br>
    <div class="button-container-div">
        <input type="submit" id="submitbtn" value="Login" class="btn btn-primary">
    </div>
</form>


</body>
</html>