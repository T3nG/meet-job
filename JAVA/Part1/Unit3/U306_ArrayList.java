package Unit3;
import java.util.*;

public class U306_ArrayList
{
	public static void main(String[] args)
	{
        ArrayList lst = new ArrayList(3);
        //ArrayList<String> lst = new ArrayList<>(3);
        
        lst.add("Lily");
        lst.add("Lulu");
        lst.add("Nana");
        lst.add("Jojo");
        lst.add("Anna");    
        lst.add("Diana"); 
        
		for( Object element:lst ) System.out.println(element);		 
	}
}