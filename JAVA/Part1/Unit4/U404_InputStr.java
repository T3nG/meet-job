package Unit4;
import java.util.*;

public class U404_InputStr
{
    public static void main(String[] args)
	{
        String name,addr;				
		Scanner keyin = new Scanner(System.in);
        
		System.out.print("�m�W: ");
		name = keyin.nextLine();
			
		System.out.println();	
		System.out.println("�A��J���m�W�O: " + name + '\n');

        System.out.print("�a�}: ");
        addr = keyin.nextLine();  
          
        System.out.println();   
        System.out.println("�A��J���a�}�O: " + addr);
	}
	
}