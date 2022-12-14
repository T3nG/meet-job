package Unit5;
public class U505_ShortCircuit 
{    
    public static void main(String[] args) 
    {
        int x=6;
        boolean b;
        
        b = x++ > 5 | ++x > 6;
        
        System.out.println("|¹Bºâ«áxªº­È: " + x);
        System.out.println(b);
    }
	
}