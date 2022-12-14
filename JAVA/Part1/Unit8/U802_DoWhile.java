package Unit8;
public class U802_DoWhile 
{
    public static void main(String[] args) 
    {
        int x=1, total=0;
        
        do                  
            total+=x++;
        while( x<=5 );
        
        System.out.println("Á`©M:" + total);
    }
}