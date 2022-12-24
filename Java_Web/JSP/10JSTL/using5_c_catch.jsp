<!-- ************* using5_c_catch.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>c:catch 標籤</title>
  </head>
  
  <body>
    <c:catch var="msg">
    <%
      int[] ary = {10,20,30}; 
      int total = 0  ; 
      for(int i=0; i<4; i++){
        total+=ary[i];                
      }
    %>
    </c:catch>
    <h1>
      <c:out value ="${msg}" />
	</h1>  
  </body>
  
</html>
