package Unit5;
import java.io.*;

public class U506_IfElseIf
{
	public static void main(String[] args) throws IOException
	{
		char inChar;
		
		System.out.print("�п�J���N�r���G");
		inChar = (char)System.in.read();
		System.in.read(); 
		System.in.read();
		
		System.out.println();
		
        if(inChar >= 'A' && inChar <= 'Z')
          System.out.println("��J���O�j�g�r��" + inChar);
        else if(inChar >= 'a' && inChar <= 'z') 
          System.out.println("��J���O�p�g�r��" + inChar);
        else if(inChar >= '0' && inChar <= '9')    
          System.out.println("��J���O�Ʀr�r��" + inChar);
        else  
          System.out.println("��J���O�Ÿ��r��" + inChar);
    }
}
