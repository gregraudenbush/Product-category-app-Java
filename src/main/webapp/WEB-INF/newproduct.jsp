<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	
	<form:form method="POST" action="/products/newform" modelAttribute="product">
	<table>
		   
        
        <br/>
  		<form:label path="name">Name:
    		
    		<form:input path="name"/></form:label>
    		<span style="color: red"><form:errors path="name"/></span>
    		</br>
    		
    		<form:label path="description">description
    		<form:textarea path="description"/></form:label>
    		<span style="color: red"><form:errors path="description"/></span>
    		</br>
    		
    		<form:label path="price">Price:
    		
    		<form:input type="number" path="price"/></form:label>
    		<span style="color: red"><form:errors path="price"/></span>
    		</br>
    		
    		
    		</br>
		
		
		<input type="submit" value="Submit"/>
		</table>
	</form:form>

</body>
</html>