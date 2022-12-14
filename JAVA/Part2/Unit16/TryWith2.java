package Unit16;
import java.io.*;

public class TryWith2
{
    public static void main(String[] agrs) throws IOException
    {
        String name="src\\Unit16\\TryWith2.java";
        String str;
        
        try( BufferedReader input=new BufferedReader( new FileReader(name) ) ) {
        
           while((str = input.readLine())!= null)
           {
               System.out.println(str);
           }    
        }
        catch(FileNotFoundException e) {
        
            System.out.println("Hi");
        }


        System.out.println("第二次讀取");
//或	
        try( BufferedReader input=new BufferedReader( new FileReader(name) ) ) {
        
           while((str = input.readLine())!= null)
           {
               System.out.println(str);
           }    
        }       
    }
}