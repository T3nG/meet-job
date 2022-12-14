package Unit15.ByteStream;
import java.io.*;

public class EX08_FileOutputStream
{
	static void myPrint(String s) 
	{	
		System.out.print(s);
	}

	public static void main(String[] args) throws IOException
	{
        String aphorism = "You will never win, if you never begin.";
        byte[] data = aphorism.getBytes();	
			           
        myPrint("���b�g�J�ɮ�...EX08.txt \n");
        
        OutputStream file1 = new FileOutputStream("EX08.txt");	      
		for(int i=0; i<data.length; i++)
		{
			file1.write(data[i]);
		}
				
		FileOutputStream file2 = new FileOutputStream("EX08.txt");	
		file2.write(data);
			      
		FileOutputStream file3 = new FileOutputStream("EX08.txt");	
		file3.write(data, 0, 18);	
		
		file1.close();	
		file2.close();
		file3.close();
	}
	
}