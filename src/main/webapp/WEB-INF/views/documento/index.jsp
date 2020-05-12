<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

<link rel="StyleSheet" type="text/css" href="css/estilos.css" media="screen" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QR Code - Documentos</title>
</head>
<body>

	<h3 align="center">Lista de documentos</h3>
	
	<table  class="table" border="2" cellpadding="2" cellspacing="2">
		<tr>
			
			<th>QrCode</th>
		</tr>
		<c:forEach var="documento" items="${documentos }">
			<tr>
				<td>
					<img src="${pageContext.request.contextPath }/documento/qrcode/${documento.id}" width="200" height="200"
						inputmode=${documento.url }
					>
					
				</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>