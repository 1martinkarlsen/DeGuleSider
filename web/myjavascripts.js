$(document).ready(function () {

//Stops the submit request
    $("#myAjaxRequestForm").click(function (e) {
        e.preventDefault();
    });
    //checks for the button click event
    $("#myButton").click(function (e) {

//get the form data and then serialize that
        dataString = $("#myAjaxRequestForm").serialize();
        //get the form data using another method 
//        var personID = $("input#personIDnum").val();
//        dataString = "" + personID;
        //make the AJAX request, dataType is set to json
        //meaning we are expecting JSON data in response from the server
        var personID = dataString;
        alert("Input: " + personID);
        
        
        $.ajax({
            type: "POST",
            data: dataString,
            dataType: "application/json",
            url: "http://localhost:8084/DeGuleSider/api/person"
        }).done(function (person) {

            person = JSON.parse(person);
            var personID = "personID";
            var firstname = "firstname";
            var lastname = "lastname";
            var email = "email";
            var personID = "phone";
            var firstname = "street";
            var lastname = "zip";
            var email = "hobby";

            $(".personContent #personID").html(personID);
            $(".personContent #firstname").html(firstname);
            $(".personContent #lastname").html(lastname);
            $(".personContent #email").html(email);
            $(".personContent #phone").html(phone);
            $(".personContent #street").html(street);
            $(".personContent #zip").html(zip);
            $(".personContent #hobby").html(hobby);

        }).fail(function () {
            alert("Failed");
        });
    });
});


