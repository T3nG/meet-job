/* 
 * 密碼:1234
 */
package Unit8.Lab;
import java.util.*;

public class Lab_CheckPWD
{
   public static void main(String args[]) 
   {            
        Scanner keyin = new Scanner(System.in);
                     
        String password="1234";
        String pwd; 
        int n;             
        for( n=1; n<=3; n++ )
        {
            System.out.print("密碼:");
            pwd=keyin.nextLine();    
        }
        
        //密碼正確繼續執行1+2+...+n
        System.out.print("輸入整數:");
        
//        for( ) 
//        {
        keyin.close();
        } 
                
   }