<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">

    <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">
        <div>Json documentation</div>
        <div id="jsonsection">
            <p>
                Vi har benyttet os af Json til at sende data frem og tilbage mellem serveren og browseren
                på et sprog som begge forstår.
                <br>
                Her er et eksempel på et JSon object som vi bruger til at add en person
            </p>
            {"firstName" : "kawdle", "lastName" : "akwd", "email" : "my@email.dk",
            "phoneList" : [{"number" : "13371337", "description" : "Home number"},
            <br>
            {"number" : "78945612", "description" : "Mobile phone"}],
            <br>
            "hobbyList" : [{"name" : "fodbold"},
            <br>
            {"name" : "Programming", "description" : "HTML, CSS, Java, jQuery, Ajax, Rest Api og mere"}],
            "address" : {"street" : "Totally street G.", "city" : {"zip" : "2800", "city" : "Kongens Lyngby"}}}
            <p>
                Vi bruger dette Json object i vores Rest service hvor vi så oversætter det til et sprog som Java kan
                forstå og arbejde med ved at benytte gson library til at lave et Person object
                og når vi så har fået lavet det Person object kan vi tildele det de properties som Json objectet havde
                og derved fylde data i vores object
            </p>
        </div>
    </div>
</t:baseTemplate>
