<!-- JSP程式：included.jsp -->
<html>
  <head>
    <title>included.jsp</title>
  </head>
  <body>
  <% 
    // 取得傳入的參數      
    int rows = Integer.parseInt(request.getParameter("rows"));
    int cols = Integer.parseInt(request.getParameter("cols"));
    // 顯示計算結果
	out.print("<font size='5'>");
	
    for(int i = 1; i <= rows; i++){
      for(int j = 1; j <= cols; j++){
        out.print( i*j + " ");
      }
      out.print("<br>");
    }
	
	out.print("</font>");
  %>
  </body>
  
</html>