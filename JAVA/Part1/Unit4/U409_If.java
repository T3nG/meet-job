package Unit4;
public class U409_If 
{
    public static void main(String[] args) 
    {
        int score = 70;
        
        //語法1
        if( score >= 60 )
        {
           System.out.println("及格");
        }
        
        //語法2
        if( score >= 60 ) {
        
           System.out.println("及格");
        }
        
        //語法3
        if( score >= 60 )
           System.out.println("及格");
        
        //語法4
        if( score >= 60 ) System.out.println("及格");
           
    }   
}