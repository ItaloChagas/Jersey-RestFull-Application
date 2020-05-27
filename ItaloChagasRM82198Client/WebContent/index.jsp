<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<jsp:useBean id="obj" class="br.com.fiap.application.Consultar"/>  

<c:forEach items = "${obj.getService()}" var = "venda">
         <c:out value = "${venda}"/><p>        
      </c:forEach>


</body>
</html>