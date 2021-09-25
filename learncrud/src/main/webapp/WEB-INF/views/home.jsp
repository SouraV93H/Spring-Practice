<html>
<head>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">

<div class="row">
<div class="col-md-12">
<h1 class="text-center">Welcome to Product</h1>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
 <c:forEach items="${product}" var="p">

    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td>&#x20B9;${p.price}</td>
      <td>
      <a href="delete/${p.id}"><i class="fas fa-trash text-danger"></i></a>
      <a href="update/${p.id}"><i class="fas fa-pen"></i></i></a>
      </td>
    </tr>
      </c:forEach>
  </tbody>
</table>
<div class="container">
<a href="addproduct" class="btn btn-success">Add Product</a>
</div>

</div>
</div>

</div>
</body>
</html>
