
import java.sql.*;

public class MySQL_Connect
{
    public static void main(String[] args){
        Connection dbCon = null;
        Statement stmt = null;
        //�{���Ѽ�
        String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String sCon = "jdbc:odbc:ok";

        //���JJDBC driver 
        try{    
            Class.forName(sDriver);
        }
        catch(Exception e){
            System.out.println("�L�k���J�X�ʵ{��");
            return;
        }

        //�إ߸�Ƴs���MStatement����
        try{
            dbCon = DriverManager.getConnection(sCon);
            if (dbCon != null){
                System.out.println("�إ�Connection���󦨥\!");
                stmt = dbCon.createStatement();
                if (stmt != null){
                    System.out.println("�إ�Statement���󦨥\!");
                }
            }
        }
        catch(SQLException e){
            System.out.println("�P��ƨӷ��s�����~: " + sCon);
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



