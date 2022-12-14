//四捨五入到千位數 使用 Math.round()
package Unit7.Lab;
import java.util.Scanner;

public class Lab2_Round_Thousand
{
	public static void main(String[] args)
	{
        Scanner keyin = new Scanner(System.in);
		
		System.out.print("請輸入數值: ");
		String str = keyin.nextLine();
		
		double num = Double.parseDouble(str);
	   
		//Insert code to here
             
		System.out.println("結果 = "+Math.round(num/1000)*1000  );
	       
    }
}


        /*
        
        import java.io.*;
        
        BufferedReader keyin = new BufferedReader(
                        new InputStreamReader(System.in));
                        
        String str = keyin.readLine();
        
        */

