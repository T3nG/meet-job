<%-- ************* page2.jsp ************* --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>application物件</title>
  </head>
  <body>
    <font size="6"><b>第二張網頁</b></font><p>
    <% 
      String data1 = (String)application.getAttribute("app_data"); 
	  
      session = request.getSession();	 
      String data2 = (String)session.getAttribute("sess_data");
     	  
    %>
    <font size="7" color="red">
      application資訊內容為： <%= data1 %>
	  <p>
	  session資訊內容為： <%= data2 %>
    </font>
  </body>
  
</html>