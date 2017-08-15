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
	<h1>${category.name}</h1>
	
	<br><br>
	<h3>Categories</h3>
	<ul>
		<ul>
		<c:forEach items="${category.products}" var="item">
        		 <li><a href="product/${item.id}">${item.name}</a></li>
      	</c:forEach>
	</ul>
	<br>
	<br>
	<br>
	<h3>Add a Product</h3>
	<form method="POST" action="/category/${category.id}/new" >
		<table>
	
		  <select name="product">
			
			<c:forEach var="cate" items="${products}" >
				
					<option value="${cate.id }">${cate.name}</option>
				
			</c:forEach>
		</select>
        
		
		
		<input type="submit" value="Submit"/>
		</table>
	</form>

</body>
</html>