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
//       
        //make the AJAX request, dataType is set to json
        //meaning we are expecting JSON data in response from the server
        
        alert("Input: " + dataString);
        
        
        $.ajax({
            type: "POST",
            data: { firstname: "John", lastname: "Boston" },
            dataType: "application/json",
            url: "/api/person"
        }).done(function (person) {

            person = JSON.parse(person);
            
            var firstname = person[0].firstname;
            var lastname = person[0].lastname;
            var email = person[0].email;
            var phone = person[0].phone;
            var street = person[0].street;
            var zip = person[0].zip;
            var hobby = person[0].hobby;

            $(".personContent #firstname").innerHTML(firstname);
            $(".personContent #lastname").innerHTML(lastname);
            $(".personContent #email").innerHTML(email);
            $(".personContent #phone").innerHTML(phone);
            $(".personContent #street").innerHTML(street);
            $(".personContent #zip").innerHTML(zip);
            $(".personContent #hobby").innerHTML(hobby);

        }).fail(function () {
           
            alert("Failed");
        });
    });
});


