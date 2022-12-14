
import java.io.IOException;
import java.util.Scanner;

public class Lab_Round2_105571775
{
	public static void main(String[] args) throws IOException
	{
		//四捨五入到小數第2位 使用 Math.floor() ?? floor 要怎麼四捨五入??
        Scanner keyin = new Scanner(System.in);
		
		System.out.print("請輸入數值: ");
		String sNum = keyin.nextLine();
		
		double iNum = Double.parseDouble(sNum);
		System.out.println(iNum);
	   
		//Insert code to here
		System.out.println("結果 = " +Math.round(iNum*100)/100.00);
	    keyin.close();
    }
}


        /*
        BufferedReader keyin = new BufferedReader(
                        new InputStreamReader(System.in));
                        
        String sNum = keyin.readLine();
        
        */

