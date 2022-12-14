
import java.util.Scanner;

public class Lab2_Round_Thousand_105571775
{
	public static void main(String[] args)
	{
        //四捨五入到千位數 使用 Math.round()
        Scanner keyin = new Scanner(System.in);
		
		System.out.print("請輸入大於一千的數值: ");
		String str = keyin.nextLine();
		
		double num = Double.parseDouble(str);
	   
		//Insert code to here
             
		System.out.println("結果 = " +Math.round(num/1000)*1000);
	       //99441 => 99000 99441/1000=99.441 round 99.0 * 1000
        keyin.close();
    }
}


        /*
        
        import java.io.*;
        
        BufferedReader keyin = new BufferedReader(
                        new InputStreamReader(System.in));
                        
        String str = keyin.readLine();
        
        */

