//�|�ˤ��J��p�Ʋ�2�� �ϥ� Math.floor()
package Unit7.Lab;
import java.io.*;
import java.util.Scanner;

public class Lab_Round2
{
	public static void main(String[] args) throws IOException
	{
        Scanner keyin = new Scanner(System.in);
		
		System.out.print("�п�J�ƭ�: ");
		String sNum = keyin.nextLine();
		
		double iNum = Double.parseDouble(sNum);
	   
		//Insert code to here
        iNum = iNum*100 + 0.5;
		System.out.println("���G = "+Math.floor(iNum)/100 );
	       
    }
}


        /*
        BufferedReader keyin = new BufferedReader(
                        new InputStreamReader(System.in));
                        
        String sNum = keyin.readLine();
        
        */

