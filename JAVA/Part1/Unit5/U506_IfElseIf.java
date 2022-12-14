package Unit5;
import java.io.*;

public class U506_IfElseIf
{
	public static void main(String[] args) throws IOException
	{
		char inChar;
		
		System.out.print("請輸入任意字元：");
		inChar = (char)System.in.read();
		System.in.read(); 
		System.in.read();
		
		System.out.println();
		
        if(inChar >= 'A' && inChar <= 'Z')
          System.out.println("輸入的是大寫字元" + inChar);
        else if(inChar >= 'a' && inChar <= 'z') 
          System.out.println("輸入的是小寫字元" + inChar);
        else if(inChar >= '0' && inChar <= '9')    
          System.out.println("輸入的是數字字元" + inChar);
        else  
          System.out.println("輸入的是符號字元" + inChar);
    }
}
