
import java.sql.*;

public class Mariadb_ConnectType4
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        //�Ѽ�
        String sDriver = "org.mariadb.jdbc.Driver";
      
        String url="jdbc:mariadb://localhost/mydb";
        String acc="root";
        String pwd="1234";
        
        //���JJDBC driver 
        try   
        {     
            Class.forName(sDriver);
        }
        catch(Exception e)
        {
           System.out.println("�L�k���J�X�ʵ{��");
           return;
        }
        
        //�إ߸�Ƴs���MStatement����
        try   
        {
            conn = DriverManager.getConnection(url,acc,pwd);
            if(conn != null)
            {
                System.out.println("�إ�Connection���󦨥\!");
                
                stmt = conn.createStatement();
                if(stmt != null)
                    System.out.println("�إ�Statement���󦨥\!");
            }
        }     
        catch(SQLException e)
        {
            System.out.println("�P��ƨӷ��s�����~: " );
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