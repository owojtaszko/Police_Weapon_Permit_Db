<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz do dodawania broni</title>
</head>
<body>

<form:form method="POST" cssClass="form" action="/addGun" modelAttribute="gun">

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer promesy</span>
        </div>
        <form:input cssClass="form-control" path="ID_PROMISE"/>
    </div>

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Rodzaj</span>
        </div>
        <form:input cssClass="form-control" path="KIND_GUN"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Marka</span>
        </div>
        <form:input cssClass="form-control" path="BRAND"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Model</span>
        </div>
        <form:input cssClass="form-control" path="MODEL"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Kaliber</span>
        </div>
    <form:input cssClass="form-control" path="CALIBER"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer seryjny</span>
        </div>
        <form:input cssClass="form-control" path="ID_SERIA"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Rok produkcji</span>
        </div>
        <form:input cssClass="form-control" path="YEAR_PROD"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Data rejestracji</span>
        </div>
        <form:input cssClass="form-control" path="DATE_GUN_REGISTRATION"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Aktualna promesa</span>
        </div>
        <form:input cssClass="form-control" path="LAST_PROMISE"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Status broni</span>
        </div>
        <form:input cssClass="form-control" path="GUN_STATUS"/>
    </div>

    <input class="btn btn-primary" type="submit" value="Submit">
</form:form>

<a href="/addGun" target="zakladka">Clear</a>

</body>
</html>
