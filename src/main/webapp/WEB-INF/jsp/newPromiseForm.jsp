<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz do dodawania promes</title>
</head>
<body>

<form:form method="POST" cssClass="form" action="/addPromise" modelAttribute="promise">

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer promesy</span>
        </div>
        <form:input cssClass="form-control" path="ID_PROMISE"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer pozwolenia</span>
        </div>
        <form:input cssClass="form-control" path="ID_PERMIT"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">PESEL posiadacza</span>
        </div>
        <form:input cssClass="form-control" path="PESEL"/>
    </div>

    <div class="input-group input-group-lg">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Status promessy</span>
        </div>
        <form:input cssClass="form-control" path="PROMISE_STATUS"/>
    </div>

    <input class="btn btn-primary" type="submit" value="Submit">
</form:form>

<a href="/addPromise" target="zakladka">Clear</a>

</body>
</html>
