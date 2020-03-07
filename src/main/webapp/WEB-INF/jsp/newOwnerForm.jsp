<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz do dodawania posiadaczy</title>
</head>
<body>

<form:form method="POST" cssClass="form" action="/addOwner" modelAttribute="owner">

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">PESEL</span>
        </div>
        <form:input cssClass="form-control" path="PESEL"/>
    </div>

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Imię</span>
        </div>
        <form:input cssClass="form-control" path="NAME"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Nazwisko</span>
        </div>
        <form:input cssClass="form-control" path="SURNAME"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Ulica</span>
        </div>
        <form:input cssClass="form-control" path="STREET"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Nr domu</span>
        </div>
    <form:input cssClass="form-control" path="HOUSE_NUMBER"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Nr lokalu</span>
        </div>
        <form:input cssClass="form-control" path="FLAT_NUMBER"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Miejscowość</span>
        </div>
        <form:input cssClass="form-control" path="CITY"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Województwo</span>
        </div>
        <form:input cssClass="form-control" path="REGION"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Data urodzenia</span>
        </div>
        <form:input cssClass="form-control" path="BIRTH_DATE"/>
    </div>


    <input class="btn btn-primary" type="submit" value="Submit">
</form:form>

<a href="/addOwner" target="zakladka">Clear</a>

</body>
</html>