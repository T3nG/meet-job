
import java.util.Scanner;

public class Lab_InputPassword_105571775
{
    public static void main(String[] args) 
    {
        // Lab: 檢查使用者密碼
        String password="1234";
        String pwd;
        
        // Insert code to here
        Scanner keyin = new Scanner(System.in);
        System.out.print("請輸入密碼: ");
        
        pwd = keyin.nextLine();
        keyin.close();
		
        if( pwd.equals(password) )
           System.out.println("Welcome !!");
           
        else{
        
           System.out.println("請再確認密碼 !"); 
           System.exit(0);  //中斷程式
           keyin.close();
        }   
    }
	
}