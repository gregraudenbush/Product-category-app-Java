<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Products and Categories</title>
</head>
<body>
	<a href="/products/new">New Product</a>
	<a href="/category/new">New Category</a>
	<br>
	<br>
	<h5>Products</h5>
	<ul>
		<c:forEach items="${products}" var="item">
        		 <li><a href="product/${item.id}">${item.name}</a></li>
      	</c:forEach>
	</ul>
	
	<br>
	<br>
	<h5>Categories</h5>
	<ul>
		<c:forEach items="${categories}" var="item">
        		 <li><a href="category/${item.id}">${item.name}</a></li>
      	</c:forEach>
	</ul>
	
</body>
</html>