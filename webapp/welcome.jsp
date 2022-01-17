<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
		
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		
		response.setHeader("Expires", "0"); //proxies
	
		if(session.getAttribute("email") == null){
			response.sendRedirect("index.jsp");
		}
	
	
	%>

	<h1> welcome  </h1>
	<a href= "files.jsp">Check my videos here</a>
	<form action="Logout">
		<button>logout</button>
	</form>
	
</body>
</html>