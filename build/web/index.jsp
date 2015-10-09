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
                <legend>Post funktion</legend>
                <p>
                
                <label for="firstname">Firstname: </label>
                <input id="firstname" type="text" name="firstname" /><p>

                <label for="lastname">Lastname: </label>
                <input id="lastname" type="text" name="lastname" /><p>

                <label for="email">Email: </label>
                <input id="email" type="text" name="email" /><p>
                    
                <label for="phone">Phone: </label>
                <input id="phone" type="text" name="phone" /><p>
                
                <label for="street">Street: </label>
                <input id="street" type="text" name="street" /><p>
                    
                <label for="zip">Zip code: </label>
                <input id="personIDNum" type="text" name="zip" /><p>
                    
                <label for="hobby">Hobby: </label>
                <input id="hobby" type="text" name="hobby" /><p>

                </p>

                <p>
                     <label for="myButton">Submit: </label>
                    <button id="myButton" type="button" value="Submit" click="sendInfo()"/>
                </p>

            </fieldset>
            <p>
        </form>
        <div id="responseSection">
            <fieldset>
                <legend>Response</legend>
                <div class="personContent">
                    
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
