<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>Inheritance vi har brugt</div>
        <div id="section">
            <p>
                Vi har brugt inheritanceType.Joined.
                Vi valgte at bruge joined, da det er den der bedst overholder normalformerne for database bygning
                i denne opgave.
                
                Man kunne også havde overvejet at bruge inheritanceType.Single-Table men den ville generer en 
                masse null-værdier og en masse redundans data, som vi ikke ville lave være interesseret i.
            </p>
        </div>
    </div>
</t:baseTemplate>