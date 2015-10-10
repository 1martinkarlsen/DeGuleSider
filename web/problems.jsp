<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>Problems</div>
        <div id="section">
            <p>
                Vi har haft lidt problemer undervejs, specielt her med deployment delen.
                <br>
                Siden kan komme op på Openshift som det ses, men vores funktion addPerson virker ikke som den skal.
                Når projektet bliver kørt lokalt virker alt.
            </p>
            <p>
                Det er meningen at når man prøver at tilføje en person skal den prompte med security login, det gør den ikke.
                så kommer den også med en "failed" prompt som fortæller os at vi har fejlet vores add person.
                hvorimod den bare skulle tilføje personen og fortsætte, som den gør lokalt.
            </p>
        </div>
    </div>
</t:baseTemplate>