<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Owners list</title>
</head>
<body>
<div class="container">

    <h1>Ogólnopolska baza posiadaczy broni - wykaz promes</h1>
    <table class="table table-striped table-bordered">
        <c:forEach items="${permits}" var="item">
            <tr>
                ID_PROMISE
                ID_PERMIT
                DATE_PROMISE_RELEASE
                PESEL
                PROMISE_STATUS
                <td>${item.ID_PROMISE}</td>
                <td>${item.ID_PERMIT}</td>
                <td>${item.DATE_PROMISE_RELEASE}</td>
                <td>${item.PESEL}</td>
                <td>${item.PROMISE_STATUS}</td>
            </tr>
        </c:forEach>
</table>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<a href="addOwner" target="zakladka">Add new com.example.demo.owner</a>
</body>
</html>