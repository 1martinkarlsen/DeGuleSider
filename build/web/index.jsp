<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />

        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js" type="text/javascript"></script>

        <script type="text/javascript" src="app.js"></script>


    </head>
    <body>
        <div id="authors"> Kasper Worm, Rasmus Hansen, Martin Karlsen </div>

        <div id="class">B class</div>

        <div id= "group"> Group number ???</div>
        <br>
        <br>

        <form id="myAjaxRequestForm">
            <fieldset>
                <legend>Ajax opslag</legend>
                <p>
                    <label for="personID">Person ID:</label>
                    <input id="personIDNum" type="text" name="personID" />
                </p>

                <p>
                    <button id="myButton" type="button" value="Submit" click="sendInfo()"/>
                </p>

            </fieldset>
        </form>
        <div id="responseSection">
            <fieldset>
                <legend>Response</legend>
                <div class="personContent">
                    <div id="personID">Person ID: </div>
                    <div id="firstname">Firstname: </div>
                    <div id="lastname">Lastname:</div>
                    <div id="email">Email: </div>
                    <div id="phone">Phone: </div>
                    <div id="street">Street: </div>
                    <div id="zip">Zip: </div>
                    <div id="hobby">Hobby: </div>
                </div>
            </fieldset>
        </div>   
        <script src="myjavascripts.js"></script>
    </body>
</html>
