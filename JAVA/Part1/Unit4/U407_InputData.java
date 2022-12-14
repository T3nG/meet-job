package Unit4;
import java.io.*;

public class U407_InputData
{
   public static void main(String[] args) throws IOException
   {
        Console keyin = System.console();
        
        String acount = keyin.readLine("請輸入帳號: "); 
                     
        char[] passwd = keyin.readPassword("請輸入密碼: ");
        
        String pwd=new String(passwd);
        
        System.out.println(pwd);
   }
}  
