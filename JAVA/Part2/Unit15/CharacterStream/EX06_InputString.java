package Unit15.CharacterStream;
import java.io.*;

public class EX06_InputString
{
    public static void main(String[] args) throws IOException
	{
        String name;				
		BufferedReader keyin = new BufferedReader(
			                             new InputStreamReader(System.in));
        
		System.out.print("�m�W: ");
		name = keyin.readLine();
			
		System.out.println();	
		System.out.println("�A��J���m�W�O: " + name + '\n');

	}
}
