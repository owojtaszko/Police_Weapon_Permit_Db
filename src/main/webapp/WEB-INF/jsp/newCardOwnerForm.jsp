<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz do dodawania legitymacji posiadacza</title>
</head>
<body>

<form:form method="POST" cssClass="form" action="/addCardOwner" modelAttribute="cardOwner">

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">Numer legitymacji</span>
        </div>
        <form:input cssClass="form-control" path="ID_CARD"/>
    </div>

    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="inputGroup-sizing-lg">PESEL</span>
        </div>
        <form:input cssClass="form-control" path="PESEL"/>
    </div>

    <input class="btn btn-primary" type="submit" value="Submit">
</form:form>

<a href="/addCardOwner" target="zakladka">Clear</a>

</body>
</html>
