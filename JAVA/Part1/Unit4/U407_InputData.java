package Unit4;
import java.io.*;

public class U407_InputData
{
   public static void main(String[] args) throws IOException
   {
        Console keyin = System.console();
        
        String acount = keyin.readLine("�п�J�b��: "); 
                     
        char[] passwd = keyin.readPassword("�п�J�K�X: ");
        
        String pwd=new String(passwd);
        
        System.out.println(pwd);
   }
}  
