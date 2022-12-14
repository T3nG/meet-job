
import java.sql.*;

public class MySQL_Connect
{
    public static void main(String[] args){
        Connection dbCon = null;
        Statement stmt = null;
        //程式參數
        String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String sCon = "jdbc:odbc:ok";

        //載入JDBC driver 
        try{    
            Class.forName(sDriver);
        }
        catch(Exception e){
            System.out.println("無法載入驅動程式");
            return;
        }

        //建立資料連結和Statement物件
        try{
            dbCon = DriverManager.getConnection(sCon);
            if (dbCon != null){
                System.out.println("建立Connection物件成功!");
                stmt = dbCon.createStatement();
                if (stmt != null){
                    System.out.println("建立Statement物件成功!");
                }
            }
        }
        catch(SQLException e){
            System.out.println("與資料來源連結錯誤: " + sCon);
            System.out.println(e.getMessage());
            if (dbCon != null){
                try { dbCon.close(); }
                catch( SQLException e2 ) {}
            }
            return;
        }
        finally{
            try { 
                stmt.close(); 
                dbCon.close(); 
            }
            catch( SQLException e ) {}
        }
    }
}



