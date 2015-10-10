$(document).ready(function () {

    $("#myButton").click(function (e) {

        var first = $("#firstname").val();
        var last = $("#lastname").val();
        var email = $("#email").val();
        var phone = $("#phone").val();
        var street = $("#street").val();
        var zip = $("#zip").val();
        var hobby = $("#hobby").val();

        var jsonObj = new Object();
        jsonObj["firstName"] = first;
        jsonObj["lastName"] = last;
        jsonObj["email"] = email;
        jsonObj["phone"] = phone;
        jsonObj["street"] = street;
        jsonObj["zip"] = zip;
        jsonObj["hobby"] = hobby;

        $.ajax({
            type: "POST",
            //url: "http://localhost:8080/DeGuleSider/api/person/", //Til localhost development
            url: "api/person",
            data: JSON.stringify(jsonObj),
            dataType: "json",
            contentType: "application/json; charset=utf-8"
        }).done(function (person) {

            $(".personContent #firstname").html(person.firstname);
            $(".personContent #lastname").html(person.lastname);
            $(".personContent #email").html(person.email);
            $(".personContent #phone").html(person.phone);
            $(".personContent #street").html(person.street);
            $(".personContent #zip").html(person.zip);
            $(".personContent #hobby").html(person.hobby);

        }).fail(function () {
            alert("Failed");
        });
    });
});