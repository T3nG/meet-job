package Unit15.CharacterStream;
import java.io.*;

public class EX07_PrintWriter
{
    public static void main(String[] args) throws Exception
    {
        int i,j,k;                   

        PrintWriter output=new PrintWriter(
                               new FileWriter("EX07.txt"));
                               
        for(i=1;i<=5;i++)
        {
            for(j=0;j<5-i;j++)
            {
                output.print(" ");
            }
               
            for(k=1;k<=i*2-1;k++)
            {
                output.print("*"); 
            } 
             
            output.println();
            //output.print('\n');
            //output.printf("%n");
           
        }
        output.println("���\�g�J");
        output.close();
        
        System.out.println("���\�g�JEX07.txt");
    }
}
