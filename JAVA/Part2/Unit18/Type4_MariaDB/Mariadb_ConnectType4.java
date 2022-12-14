
import java.sql.*;

public class Mariadb_ConnectType4
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        //參數
        String sDriver = "org.mariadb.jdbc.Driver";
      
        String url="jdbc:mariadb://localhost/mydb";
        String acc="root";
        String pwd="1234";
        
        //載入JDBC driver 
        try   
        {     
            Class.forName(sDriver);
        }
        catch(Exception e)
        {
           System.out.println("無法載入驅動程式");
           return;
        }
        
        //建立資料連結和Statement物件
        try   
        {
            conn = DriverManager.getConnection(url,acc,pwd);
            if(conn != null)
            {
                System.out.println("建立Connection物件成功!");
                
                stmt = conn.createStatement();
                if(stmt != null)
                    System.out.println("建立Statement物件成功!");
            }
        }     
        catch(SQLException e)
        {
            System.out.println("與資料來源連結錯誤: " );
            System.out.println(e.getMessage());
        }
        
        try 
        { 
            stmt.close(); 
            conn.close(); 
        }
        catch( SQLException e ) {}
    }
    
}