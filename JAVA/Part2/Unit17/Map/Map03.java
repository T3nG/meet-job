package Unit17.Map;
import java.util.*;

public class Map03
{
	public static void main(String[] args)
	{
        Hashtable<String,String> ht = new Hashtable<>();
        //HashMap<String,String> ht = new HashMap<>();
        ht.put("ONE","Lily");
		ht.put("TWO","Lulu");
		ht.put("THREE","Nana");
		ht.put("FOUR","Jojo");
		ht.put("FIVE","Anna");
		
        //�HEnumeration�ȱN���X���Ҧ��������e���X�C�ȾA��Hashtable
        System.out.println("�HEnumeration�ȱN���X���Ҧ��������e���X");
        
        Enumeration e = ht.elements();    
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        } 
 
        System.out.println();
        
		for(Enumeration ee = ht.elements();ee.hasMoreElements();)
		{
			System.out.println(ee.nextElement());
	    }
	    
	}
}