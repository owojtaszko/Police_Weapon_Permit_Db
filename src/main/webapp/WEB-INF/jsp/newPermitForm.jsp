<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz do dodawania pozwolenia</title>
</head>
<body>

<form:form method="POST" cssClass="form" action="/addPermit" modelAttribute="permit">

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer pozwolenia</span>
        </div>
        <form:input cssClass="form-control" path="ID_PERMIT"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Data wydania pozwolenia</span>
        </div>
        <form:input cssClass="form-control" path="DATE_PERMIT_RELEASE"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Organ wydający</span>
        </div>
        <form:input cssClass="form-control" path="ISSUING_AUTHORITY"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Rodzaj pozwolenia</span>
        </div>
        <form:input cssClass="form-control" path="KIND_PERMIT"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">PESEL posiadacza</span>
        </div>
        <form:input cssClass="form-control" path="PESEL"/>
    </div>

    <input class="btn btn-primary" type="submit" value="Submit">
</form:form>

<a href="/addPermit" target="zakladka">Clear</a>

</body>
</html>
