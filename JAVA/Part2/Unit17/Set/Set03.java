package Unit17.Set;
import java.util.*;

public class Set03
{
	public static void main(String[] args)
	{
        SortedSet<String> set = new TreeSet<String>();      
		set.add("Jojo");	
		set.add("Lily");
		set.add("Lulu");
		set.add("Nana");	
		set.add("Diana");
		//set.add(123);
        System.out.println("�������X����:");
		System.out.println(set);
		System.out.println();
        SortedSet sub_set = set.subSet("Diana","Lulu");    
		System.out.println("�������X����:");
		System.out.println(sub_set);
	}
}