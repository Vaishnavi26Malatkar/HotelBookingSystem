<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Edit Form</title>

<link rel="stylesheet" href="styles/addproductformstyle.css">
<script type="text/javascript" src="Scripts/productaddvalidation.js"></script>
</head>
<body>
<%@ include file="header.html" %>
<h2>${productadderror}</h2>
<div class="productContainer">
	<form name="addForm" action="editproduct" method="post" onsubmit="return validateProductForm()">
   		
   		<label for="pid"> Product Id: </label>
   		<input type="number" name="productId" id="pid" value="${param.productId}" readonly><br>
   		
   		<label for="pnm"> Product Name: </label>
   		<input type="text" name="name" id="pnm" value="${param.name}"><br>
   		
   		<label for="pbr"> Product Brand: </label>
   		<input type="text" name="brand" id="pbr" value="${param.brand}"><br>
   		
   		<label for="ppr"> Product Price: </label>
   		<input type="text" name="price" id="ppr" value="${param.price}"><br>

		
	
		<input type="Submit" value="Edit">
	
	</form>
</div>
</body>
<%@ include file="footer.html" %>	
</html>