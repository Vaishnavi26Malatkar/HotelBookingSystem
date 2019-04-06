<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Add</title>

<link rel="stylesheet" href="styles/addproductformstyle.css">
<script type="text/javascript" src="Scripts/productaddvalidation.js"></script>
</head>
<body>
<%@ include file="header.html" %>
<h2>${productadderror}</h2>
<div class="productContainer">
	<form name="addForm" action="addproduct" method="post" onsubmit="return validateProductForm()">
   		<label for="pnm"> Product Name: </label>
   		<input type="text" name="name" id="pnm" placeholder="Enter Product Name..."><br>
   		
   		<label for="pbr"> Product Brand: </label>
   		<input type="text" name="brand" id="pbr" placeholder="Enter Product Brand..."><br>
   		
   		<label for="ppr"> Product Price: </label>
   		<input type="text" name="price" id="ppr" placeholder="Enter Product Price..."><br>

		
	
		<input type="Submit" value="Submit">
		<input type="reset">
	</form>
</div>
</body>
<%@ include file="footer.html" %>	
</html>