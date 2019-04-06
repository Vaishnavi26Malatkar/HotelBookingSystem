<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Delete Form</title>

<link rel="stylesheet" href="styles/addproductformstyle.css">

</head>
<body>
<%@ include file="header.html" %>
<h2>${productadderror}</h2>
<div class="productContainer">
	<form name="deleteForm" action="deleteproduct" method="post">
   		
   		<label for="pid"> Product Id: </label>
   		<input type="number" name="productId" id="pid" value="${param.productId}" readonly><br>
   		
   		<label for="pnm"> Product Name: </label>
   		<input type="text" name="name" id="pnm" value="${param.name}" readonly><br>
   		
   		<label for="pbr"> Product Brand: </label>
   		<input type="text" name="brand" id="pbr" value="${param.brand}" readonly><br>
   		
   		<label for="ppr"> Product Price: </label>
   		<input type="text" name="price" id="ppr" value="${param.price}" readonly><br>

		
	
		<input type="Submit" value="Are You Sure to delete..??">
	
	</form>
</div>
</body>
<%@ include file="footer.html" %>	
</html>