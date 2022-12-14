package Unit8;
import java.util.*;

public class U806_PrintList
{
	public static void main(String[] args)
	{
		//generic 泛型 ArrayList<String> 省略了String
		//先配置4個, 若超過每次再給4個
        List<String> list = new ArrayList<>(4); 
        
		list.add("Lily");
		list.add("Lulu");
		list.add("Nana");
		list.add("Jojo");
		list.add("Anna");
		list.add("Diana");
		
		// for(Object s : ...  支援promotion的意義
        for(String s : list) System.out.println(s);
	}
}