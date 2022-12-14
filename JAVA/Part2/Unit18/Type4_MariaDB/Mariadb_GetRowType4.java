
import java.sql.*;

public class Mariadb_GetRowType4
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //�Ѽ�
        String sDriver = "org.mariadb.jdbc.Driver";
      
        String url="jdbc:mariadb://localhost/mydb";
        String acc="root";
        String pwd="1234";
        String sql = "SELECT num,name,sex,birth,address FROM employee";
       
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
                //System.out.println("�إ�Connection���󦨥\!");
                
                stmt = conn.createStatement();
                if(stmt != null){}
                   // System.out.println("�إ�Statement���󦨥\!");
            }
        }     
        catch(SQLException e)
        {
            System.out.println("�P��ƨӷ��s�����~: " );
            System.out.println(e.getMessage());
        }
        
       try 
       { 
           rs = stmt.executeQuery(sql);
           while (rs.next())
           {
               System.out.print(rs.getString("NUM"));
               System.out.print("\t");
               System.out.print(rs.getString("NAME"));
               System.out.print("\t");

               String gender=rs.getString("SEX");
               if(gender.equals("M"))
                   System.out.print("����\t");
               else
                   System.out.print("�p�j\t");
                   
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
                conn.close(); 
           }
           catch( SQLException e ) {}
       }
    }
}
