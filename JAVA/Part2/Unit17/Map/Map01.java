package Unit17.Map;
import java.util.*;

public class Map01
{
	public static void main(String[] args)
	{
		Map map = new TreeMap();
		map.put(new Integer(2), "Lily");
		map.put(new Integer(2), "Lulu");
		map.put(new Integer(3), "Nana");
		map.put(new Integer(1), "jojo");
		
        System.out.println("�������X����:");
		System.out.println(map);
	}
}