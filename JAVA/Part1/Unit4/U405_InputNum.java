package Unit4;
import java.util.*;

public class U405_InputNum
{
	public static void main(String[] args)
	{
       Scanner keyin = new Scanner(System.in);
       
       System.out.print("�п�J���: ");
       String str1 = keyin.nextLine();
       
       /*
         �ˬd��ƦX�z��
       */
       
	   int iNum = Integer.parseInt(str1);
       System.out.println("�N��J����� X 5 = " + iNum*5);

	   
	   System.out.println();
	   System.out.print("�п�J�B�I��: ");
       String str2 = keyin.nextLine();

       /*
         �ˬd��ƦX�z��
       */

       double fNum = Double.parseDouble(str2);
       System.out.println("�N��J���B�I�� X 5 = " + fNum*5);
	}
	
}