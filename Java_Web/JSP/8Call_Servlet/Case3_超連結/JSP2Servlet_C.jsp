<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <head> <title>JSP calling Servlet</title> </head>
  <body>
    <!-- Forward processing to a servlet -->
    <%
      out.print("<a href='doMyServletC?user=Anna'>Call Servlet</a>");
      session.setAttribute("empid", "12345");
    %>
    
    
  </body>
  
</html>