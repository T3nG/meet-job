
import java.sql.*;
import javax.sql.rowset.*;

public class MairaDB_RowSet
{
    public static void main(String[] args) throws SQLException 
    {
        //戈畐ン
        JdbcRowSet rowset = null;
		//CachedRowSet rowset = null;
		
        //臱笆祘Α把计
        String sDriver = "org.mariadb.jdbc.Driver";
       
        String user     = "root";
        String password = "1234";
        String url      = "jdbc:mariadb://127.0.0.1/mydb";
        String sql      = "select * from employee";
       
        try{   //更 JDBC driver 
            
            Class.forName(sDriver);
        }
        catch(Exception e){
       
            System.out.println("礚猭更臱笆祘Α");
            return;
        }
       
       
        rowset = RowSetProvider.newFactory().createJdbcRowSet();
        //rowset = RowSetProvider.newFactory().createCachedRowSet();
       
        rowset.setUrl(url);
        rowset.setUsername(user);
        rowset.setPassword(password);
        rowset.setCommand(sql);
        rowset.execute();
       
        System.out.println("NUM"+'\t'+"NAME"+"\t\t"+"SEX"+'\t'+"BIRTH"+'\t'+'\t'
                               +"AGE"+'\t'+"ADDRESS");
        System.out.println("================================================"+
                              "==================================");                    
        while(rowset.next())
        {
            System.out.printf("%-8s",rowset.getString("NUM"));
            System.out.printf("%-10s",rowset.getString("NAME"));
            System.out.print("\t");
            System.out.print(rowset.getString("SEX"));
            System.out.print("\t");
            System.out.print(rowset.getDate("BIRTH"));             
            System.out.print("\t");
            System.out.print(rowset.getByte("AGE"));
            System.out.print("\t");
            System.out.println(rowset.getString("ADDRESS"));
        }
    }
}
