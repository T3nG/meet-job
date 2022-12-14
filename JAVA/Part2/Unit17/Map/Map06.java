package Unit17.Map;
import java.util.*;

public class Map06
{
	public static void main(String[] args)
	{
        Map<Integer,String> map = new HashMap<>();
		map.put(1,"Lily");
        map.put(2,"Lulu");
        map.put(3,"Nana");
        map.put(4,"Jojo");
        map.put(5,"Anna");
		
        System.out.println(map);
        System.out.println(map.containsKey(2));  //�d�� key
        System.out.println(map.containsKey(6));
        System.out.println();
        
        for(Map.Entry<Integer,String> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
        
        String name="NANA";
        for(Map.Entry<Integer,String> entry : map.entrySet()) 
        {
            if(entry.getValue().toLowerCase().contains(name.toLowerCase())) 
            {
                System.out.println("\n�d�ߨ�Ӹ��:");
                System.out.println(entry.getKey()+ ":" + entry.getValue());
            }
        }
    }        
}