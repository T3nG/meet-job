<%@page contentType="text/html"%>
<%@page pageEncoding="utf-8"%>

<html>
  <head>
    <title>include指令</title>
  </head>
  <body>	
	<% out.println("<h1>using include_file.inc 的內容:</h1>");%>	
    <%@ include file="include_file.inc" %> 	
  </body>
  
</html>
