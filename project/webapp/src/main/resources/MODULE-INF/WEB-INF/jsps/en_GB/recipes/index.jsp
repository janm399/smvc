<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Recipes</title>
</head>
<body>

<table>
    <tr>
        <td>Name</td>
        <td>Cooking time [s]</td>
        <td>Cost</td>
        <td>&nbsp;</td>
    </tr>
    <c:forEach items="${recipeList}" var="r">
        <tr>
            <td><a href="<c:out value="${r.id}"/>"><c:out value="${r.name}"/></a></td>
            <td><c:out value="${r.cookingTime}"/></td>
            <td><c:out value="${r.cost}"/></td>
            <td><a href="recipes/${r.id}">[Edit]</a></td>
        </tr>
    </c:forEach>
</table>
<a href="add.html">[Add]</a>

</body>
</html>