<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>Test</div>
        <div id="section">
            <p>
                Vi har lavet nogle JUnit test hvor vi tester vores Facade og vores RestService.
                Vi tester på om vi kan tilføje en person til databasen.
            </p>
            <p>
                Den første test vi lavede var vores JUnit test hvor vi adder en person
                <img src="Images/JUnitTest.png" alt="JUnit Test" width="500" height="300" >
            </p>
            <p>
                Den anden test vi har lavet var en RestAssured test som er bygget op på en lidt anden måde.
                RestAssuredTesten tester på vores HTTP metode om der er hul igennem til hjemmesiden og serveren
                I bund og grund kan man sige at når man bruger PostMan og skriver sit post request gør du det
                samme som du ville gøre i en restAssured test, bare manuelt, så en restAssured test er et PostMan
                request, gjort automatisk
                <img src="Images/restAssuredTest.png" alt="JUnit Test" width="500" height="300" >
            </p>
        </div>
    </div>
</t:baseTemplate>