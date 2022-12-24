<!-- 指示元素 --> 
<%@ page language="java" contentType="text/html; charset=utf-8"%>

<!-- 範本元素 -->
<html>
  <head>
    <meta charset="utf-8">
	<title>JSP</title>
  </head>
  <body>
    <center>
	  <h1>
	
	    <!-- 腳本元素 -->
	    <%
	      int times=Integer.parseInt(request.getParameter("times"));
	  
	      for(int i=0; i<times; i++){
            //內建物建	  
	        out.println(" Hello, World! ");
	        out.print("<br>");
	      }
	    %>
	  </h1>
    </center>
  </body>
  
</html>