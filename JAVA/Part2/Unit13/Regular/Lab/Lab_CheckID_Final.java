
import java.io.*;

public class Lab_CheckID_Final
{
	public static void main(String[] args) throws IOException
	{
       	int total=0,n1=0;
       	String idchk = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
       	BufferedReader keyin;
	   	keyin = new BufferedReader(
			         new InputStreamReader(System.in));
	   	System.out.print("�п�J�����Ҧr��:");
	   	String s = keyin.readLine();
	  
	   	s=s.toUpperCase();
	   	
       	//�H���h��ܦ��ˬd�r��             
		if(s.matches("")) 
	    {
       		System.err.println("�����Ҧr���榡���~");
         	System.exit(0);
       	}
    
        //���r�r�����[�v��
        n1=....
        
        total=n1/10+(n1%10)*9; 
      
        //total=total+��L�r�����[�v��
        for(int x=1 ;x<=8; x++)
        {
            total+=idchk.indexOf(s.charAt(x))*(9-x);
        }      
        
        total+=idchk.indexOf(s.charAt(9));
      
        if(total % 10 == 0)
            System.out.println("�O�����Ҧr��");
        else
            System.out.println("���O�����Ҧr��");
    }
}