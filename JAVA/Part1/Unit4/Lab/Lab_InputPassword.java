// Lab: �ˬd�ϥΪ̱K�X
package Unit4.Lab;

import java.util.*;
public class Lab_InputPassword 
{
    
    public static void main(String[] args) 
    {
        String password="1234";
        String pwd;
        
        // Insert code to here
        // ��J�K�X���������ӥ�console
        //import java.io;
        //Console input = System.console();
        //char[] temp=input.readPassword("�п�J�K�X: ");
        // pwd = new String(temp);
        
        Scanner keyin = new Scanner(System.in);
        System.out.println("�п�J�K�X: ");
		pwd = keyin.nextLine();

        if(pwd.equals(password) )
        
           System.out.println("Welcome !!");
           
        else{
        
           System.out.println("�ЦA�T�{�K�X !"); 
           System.exit(0);  //���_�{��
        }   
    }
	
}