package Unit8;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

public class U809_TimeDelay
{
    public static void main(String[] args) throws InterruptedException
    {
        DateFormat dateFormat = new SimpleDateFormat("y-M-d   E  h:m:s  a", Locale.TAIWAN); 
        System.out.println(dateFormat.format(new Date())); 
        //時間延遲的傳統寫法
        //for(long x=1; x<10000000000L; x++);
                
       
        Thread.sleep(5000); //延遲5秒
        
        System.out.println(dateFormat.format(new Date())); 
    }
}