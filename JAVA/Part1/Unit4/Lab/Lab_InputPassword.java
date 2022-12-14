// Lab: 檢查使用者密碼
package Unit4.Lab;

import java.util.*;
public class Lab_InputPassword 
{
    
    public static void main(String[] args) 
    {
        String password="1234";
        String pwd;
        
        // Insert code to here
        // 輸入密碼的首選應該用console
        //import java.io;
        //Console input = System.console();
        //char[] temp=input.readPassword("請輸入密碼: ");
        // pwd = new String(temp);
        
        Scanner keyin = new Scanner(System.in);
        System.out.println("請輸入密碼: ");
		pwd = keyin.nextLine();

        if(pwd.equals(password) )
        
           System.out.println("Welcome !!");
           
        else{
        
           System.out.println("請再確認密碼 !"); 
           System.exit(0);  //中斷程式
        }   
    }
	
}