<!-- JSP程式：forward.jsp -->
<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>forward</title>
  </head>
  <body>
  <h2>程式:forward.jsp</h2>
  <% 
    // 取得傳入的參數      
    int rows = Integer.parseInt(request.getParameter("rows"));
    int cols = Integer.parseInt(request.getParameter("cols"));
	
    // 顯示計算結果
    for(int i = 1; i <= rows; i++){
      for(int j = 1; j <= cols; j++){
        out.print( i*j + "&nbsp;&nbsp;&nbsp;&nbsp;");
      }
      out.print("<br>");
    }
  %>
  </body>
  
</html>