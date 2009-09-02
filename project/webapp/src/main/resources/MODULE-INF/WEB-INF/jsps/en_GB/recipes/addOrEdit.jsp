<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Recipes</title>
</head>
<body>
<sf:form action="/recipes" method="post" commandName="recipe">
    <sf:hidden path="id"/>
    <label for="name">Name</label> <sf:input path="name" id="name"/>
    <sf:errors path="name"/>
    <br/>
    <label for="cost">Cost</label> <sf:input path="cost" id="cost"/>
    <sf:errors path="cost"/>
    <br/>
    <label for="cookingTime">Cooking time</label> <sf:input path="cookingTime" id="cookingTime"/>
    <sf:errors path="cookingTime"/>
    <br/>
    <label for="steps">Steps</label> <sf:textarea path="steps" id="steps"/>
    <sf:errors path="steps"/>
    <br/>

    <input type="submit" value="Save"/>&nbsp;<a href="/recipes">[Cancel]</a>
</sf:form>

</body>
</html>