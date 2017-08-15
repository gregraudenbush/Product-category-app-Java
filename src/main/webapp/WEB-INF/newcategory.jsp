<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Category</h1>
	
	<form:form method="POST" action="/category/newform" modelAttribute="category">
	<table>
		   
        
        <br/>
  		<form:label path="name">Name:
    		
    		<form:input path="name"/></form:label>
    		<span style="color: red"><form:errors path="name"/></span>
    		</br>
    		
    		
		
		
		<input type="submit" value="Create"/>
		</table>
	</form:form>

</body>
</html>