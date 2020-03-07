<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Posiadacze</title>
</head>
<body>
<div class="container">

    <h1>Ogólnopolska baza posiadaczy broni - wykaz posiadaczy</h1>
    <table class="table table-striped table-bordered">
        <c:forEach items="${owners}" var="item">
            <tr>
                <td>${item.PESEL}</td>
                <td>${item.NAME}</td>
                <td>${item.SURNAME}</td>
                <td>${item.STREET}</td>
                <td>${item.HOUSE_NUMBER}</td>
                <td>${item.FLAT_NUMBER}</td>
                <td>${item.CITY}</td>
                <td>${item.REGION}</td>
                <td>${item.BIRTH_DATE}</td>
                <td>${item.BIRTH_CITY}</td>
            </tr>
        </c:forEach>
</table>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<a href="addOwner" target="zakladka">+Nowy posiadacz</a>
</body>
</html>