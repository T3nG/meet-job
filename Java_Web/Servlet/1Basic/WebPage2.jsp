<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>動態網頁JSP</title>
  </head>
  <body>
    <%
      String line="";
    
      //由大而小
      for(int x=1; x<=6; x++){
    	line="<h" + String.valueOf(x) + ">" + "Welcome</h" + String.valueOf(x) + ">"; 
        out.print(line);
      }
      
      //由小而大
      for(int x=6; x>=1; x--){
    	line="<h" + String.valueOf(x) + ">" + "Welcome</h" + String.valueOf(x) + ">"; 
        out.print(line);
      }
      
    %>

  </body>
</html>
