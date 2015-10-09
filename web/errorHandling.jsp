<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">

        <div>Error Handling documentation</div>

        <div id="section">
            <p>
                Vores error handling er lavet ved at vi har oprettet vores egne exceptions, som gør at når vi fanger
                en fejl på vores site, så vil den pågældende exception blive kaldet og vist i browseren.            
            </p>
            <p>
                Vi har 2 exceptions, vores DataNotFoundException, som er en generel exception, bliver brugt hvis vi søger
                efter noget andet end en person. 
                <br>
                Det skal siges at vores NotFoundException ikke bliver brugt i projectet, men var tiltænkt en viderebygning
                projectet hvis vi kom så langt.
                <br>
                Den anden exception vi bruger er vores PersonNotFoundException, som sender brugeren hen til en
                404 code med en besked om at den person du søgte efter ikke kunne findes.
            </p>
        </div>
    </div>
</t:baseTemplate>