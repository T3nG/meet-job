<%-- ************* implicit_applicationOther.jsp ************* --%>
<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8">
    <title>application物件</title>
  </head>
  <body>
    <font size="6"><b>其他網頁</b></font><p>
    <% 
      String data = (String)application.getAttribute("app_data");    
    %>
    <font size="7" color="blue">
      application資訊內容為:<%= data %>
    </font>
  </body>
 
</html>