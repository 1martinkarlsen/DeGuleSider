<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>How to demo</div>
        <a href="documentation.html">Back to documentation overview</a>
        <div id="section">
            <p>
                Når du kommer ind på siden bliver du mødt af forsiden hvor du kan navigere rundt på siden og se vores
                documentation etc.
                Når du skal teste selve programmet.
                <br>
                1. Tryk på knappen add person
                <br>
                2. Udfyld data i felterne.
                <br>
                3. Tryk på knappen add, for at sende requested og oprette en person
                <br>
                4. Vent og se dit response med de rigtige data oprettet 
                <br>
                5. Læs resten af documentation
            </p>
        </div>
    </div>
</t:baseTemplate>
