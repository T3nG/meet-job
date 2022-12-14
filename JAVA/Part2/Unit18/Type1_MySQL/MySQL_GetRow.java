
import java.sql.*;
import java.util.*;

public class MySQL_GetRow
{
    public static void main(String[] args)
    {
       Connection dbCon = null;
       Statement stmt = null;
       ResultSet rs = null;
       String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
       String sCon = "jdbc:odbc:ok";
       
       try   
       {     
           Class.forName(sDriver);
       }
       catch(Exception e)
       {
           System.out.println("無法載入驅動程式");
           return; //System.exit(0)
       }
       try   
       {
           dbCon = DriverManager.getConnection(sCon);
           stmt = dbCon.createStatement();
       }
       catch(SQLException e)
       {
           System.out.println("與資料來源連結錯誤: " + sCon);
           System.out.println(e.getMessage());
           if (dbCon != null)
           {
              try { dbCon.close(); }
              catch( SQLException e2 ) {}
           }
           return;
       }
       
       try 
       { 
           rs = stmt.executeQuery("SELECT num,name,sex,birth,address FROM employee");
           while (rs.next())
           {
               System.out.print(rs.getString("NUM"));
               System.out.print("\t");
               System.out.print(rs.getString("NAME"));
               System.out.print("\t");
               System.out.print(rs.getBoolean("SEX"));
               System.out.print("\t");
               System.out.print(rs.getDate("BIRTH"));             
               System.out.print("\t");
               System.out.println(rs.getString("ADDRESS"));
           }
       }
       catch(SQLException e){}
       finally
       {
           try 
           { 
                stmt.close(); 
                dbCon.close(); 
           }
           catch( SQLException e ) {}
       }
    }
}

