<!-- ************* get_DateBean.jsp ************* -->
<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <title>getDateBean</title>
  </head>
  <body style="font-size:0.8cm">
    <font size="6">取得今天的日期</font><p>
  
    <jsp:useBean id= "date" scope= "session" class= "com.ted.LocalDateTimeBean" />
      年：
    <jsp:getProperty name= "date" property= "year" /><br>
      月：
    <jsp:getProperty name= "date" property= "month" /><br>
      日：
    <jsp:getProperty name= "date" property= "day" /><br>
  </body>
  
</html>