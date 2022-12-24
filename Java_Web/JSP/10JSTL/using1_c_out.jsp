<!-- ************* using1_c_out.jsp ************* -->
<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>c:out 標籤</title>
  </head>
  <body>
  
    <c:out value="這是 C:OUT輸出的文字" /><p>
    <h1>
     <c:out value="<h1>這是 C:OUT 輸出的文字</h1>" /><br>  
    </h1>        
  </body>
  
</html>