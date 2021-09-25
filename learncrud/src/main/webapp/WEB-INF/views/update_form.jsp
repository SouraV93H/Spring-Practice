<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">
<h2 class="text-center mb-3">Change the product details</h3>
<form action="${pageContext.request.contextPath}/handle-product" method="post">
<input type="hidden" value="${product.id}" name="id" >
  <div class="form-group">
    <label for="exampleInputEmail1">Product Name</label>
    <input type="text" class="form-control" 
    id="exampleInputEmail1" aria-describedby="emailHelp" 
    placeholder="Enter Product name" name="name" value="${product.name}">
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Example textarea</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" 
    rows="5" name="description" > ${product.description}</textarea>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Product Price</label>
    <input type="text" class="form-control" id="exampleInputEmail1"
     aria-describedby="emailHelp" placeholder="Enter Product price" 
     name="price" value="${product.price}">
  </div>
  <button type="submit" class="btn btn-success">update</button> 
  <a href="${pageContext.request.contextPath}/"><button type="button" class="btn btn-warning">Back</button></a>
</form>

</div>

</body>
</html>