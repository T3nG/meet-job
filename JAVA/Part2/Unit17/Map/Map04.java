package Unit17.Map;
import java.util.*;

public class Map04
{
	public static void main(String[] args)
	{
        Map<Integer,String> map = new HashMap<>();
		map.put(1,"Lily");
        map.put(2,"Lulu");
        map.put(3,"Nana");
        map.put(4,"Jojo");
        map.put(5,"Anna");
		
	    Set<Integer> set = map.keySet();  //�Nkey�s�JSet�e��
	    
	    for(Integer s : set)
	    {
	        System.out.printf("%d = %s\n", s, map.get(s));
	    }  	    
    }
}