package Unit17.Set;
import java.util.*;

public class Set01
{
	public static void main(String args[])
	{
		Set set = new HashSet();
		set.add(new Integer(10));
		set.add("abc");
		set.add(new Double(1.5));
		set.add(new Integer(10));
		set.add("abc");
		
        System.out.println("�������X����:");
		System.out.println(set);
	}
}