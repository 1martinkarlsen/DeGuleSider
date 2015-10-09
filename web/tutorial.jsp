<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>How to demo</div>
        <div id="section">
            <p>
                Når du kommer ind på siden bliver du mødt af forsiden, hvor du kan navigere rundt på siden og se vores
                documentation etc.
                Når du skal teste selve programmet.
                <br>
                1. Tryk på knappen add person.
                <br>
                2. Tryk på knappen add person igen.
                <br>
                3. Udfyld data i felterne.
                <br>
                4. Tryk på knappen add, for at sende requested og oprette en person.
                <br>
                5. Du vil blive mødt af en login prompt, hvor den spørger om brugernavn og password.
                <br>
                I test tilfælde kan man logge på som Admin (brugernavn: admin, password: admin) og få adgang til at oprette en person.
                <br>
                6. Vent og se dit response med de rigtige data oprettet.
                <br>
                7. Tryk på close for at lukke boksen, ellers kan du oprette flere brugere ved blot at udfylde felterne igen og trykke på add.
                <br>
                8. Læs resten af documentation.
            </p>
        </div>
    </div>
</t:baseTemplate>
