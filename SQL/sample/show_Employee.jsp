<!-- Java 撰寫動態網頁連線資料庫 -->

<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import= "java.sql.*" %>
<%@ page import= "java.io.*" %>
<html>
  <head>   
    <title>database_Read</title>
	<style>
	  th {
		  font-size:20px;
	  }
	</style>
  </head>
  <body>    
    <font size="6"><b>讀取資料</b></font><p>
    <%
      Connection dbCon = null;
      Statement stmt = null;
      ResultSet rs = null;
	  ResultSetMetaData md = null;
      //驅動程式參數
	   
      String sDriver = "org.mariadb.jdbc.Driver";
      String user     = "root";
      String password = "1234";
      String url      = "jdbc:mariadb://localhost/mydb";
      StringBuffer sb = new StringBuffer();

      Class.forName(sDriver);
      dbCon = DriverManager.getConnection(url,user,password);
      stmt = dbCon.createStatement();

      String sql= "select num,name,sex,birth,address from employee";
 
      if(stmt.execute(sql)){           
        rs = stmt.getResultSet();
        md = rs.getMetaData();
        int cols = md.getColumnCount();
        sb.append("<TABLE border='2' width='600'><TR>");
		
        for(int i = 1; i <= cols; i++)
            sb.append("<TH>" + md.getColumnLabel(i) + "</TH>");
		
        while(rs.next()){
				
            sb.append("<TR>");                   
            sb.append("<TD>");
            sb.append(rs.getString("NUM"));
			sb.append("</TD>");
            sb.append("<TD>");
            sb.append(rs.getString("NAME"));
			sb.append("</TD>");
            sb.append("<TD>");
            sb.append(rs.getString("SEX"));
			sb.append("</TD>");
            sb.append("<TD>");
            sb.append(rs.getDate("BIRTH"));
			sb.append("</TD>");
            sb.append("<TD>");
            sb.append(rs.getString("ADDRESS"));
			sb.append("</TD>");
        }
        sb.append("</TABLE>\n");

        String result= sb.toString();
        out.print(result);
      }
      stmt.close();
      dbCon.close();
    %>
  </body>
</html>