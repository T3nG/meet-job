
import java.io.*;

public class Lab_CheckID_AD
{
   public static void main(String[] args) throws IOException
   {
      int c1,c2,total;
      String id;
      String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
      BufferedReader keyin = new BufferedReader(
                                 new InputStreamReader(System.in));
                                 
      c1=c2=total=0;         
      System.out.print("請輸入身分證字號:");
      id = keyin.readLine();

      if(id.length()!=10)
      {
          System.err.println("長度不正確！");
	      System.exit(0);
   	  }
   	  
      id = id.toUpperCase();
      c1 = chkid.indexOf(id.charAt(0));
      c2 = chkid.indexOf(id.charAt(1));
           
      if(c1<10)
      {
          System.err.println("首字字元不正確！");
          System.exit(0);
      }
      
      if(c2<1 || c2>2)
      {
          System.err.println("性別欄不正確！");
          System.exit(0);
      }
      
      //檢查第3~第10個字元 
         

      
      total = //首字字元的加權值
	  
      //total=total+其他字元的加權值
      
     
          
      
      if(total%10 != 0)
         System.out.println("不是身分證字號");
      else
         System.out.println("合理的身分證字號");
   }       
}
