//Java �s�u��Ʈw
import java.sql.*;

public class Mysql_GetRow
{
    public static void main(String[] args)
    {
		Connection dbCon = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData md = null;
		String sql = "select * from employee where age>=40";
		
		//�{���Ѽ�
		String sDriver = "org.gjt.mm.mysql.Driver";
		//String sDriver = "com.mysql.jdbc.Driver";
		String user     = "root";
		String password = "1234";
		String url      = "jdbc:mysql://localhost/mydb";
		try   
		{     
			Class.forName(sDriver);
		}
		catch(Exception e)
		{
			System.out.println("�L�k���J�X�ʵ{��");
			return;
		}
		
		try   
		{
			dbCon = DriverManager.getConnection(url,user,password);
			stmt = dbCon.createStatement();
		}
		catch(SQLException e)
		{
			System.out.println("�P��ƨӷ��s�����~: ");
			System.out.println(e.getMessage());
			if(dbCon != null)
			{
				try { dbCon.close(); }
				catch( SQLException e2 ) {}
			}
			return;
		}
		
		try 
		{ 
			rs = stmt.executeQuery(sql);
			System.out.println("NUM"+'\t'+"NAME"+'\t'+"SEX"+'\t'+"BIRTH"+'\t'+'\t'
                               +"AGE"+'\t'+"ADDRESS");
			System.out.println("================================================"+
                              "==========================");                    
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
				System.out.print(rs.getByte("AGE"));
				System.out.print("\t");
				System.out.println(rs.getString("ADDRESS"));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try { stmt.close(); }       //����Statement����
			catch( SQLException e ) {}
			try { dbCon.close(); }
			catch( SQLException e ) {}  //�����s��
		}
    }
}