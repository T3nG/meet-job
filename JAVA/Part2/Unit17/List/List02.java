package Unit17.List;
import java.util.*;

public class List02 
{
	public static void main(String argv[])
	{
		List list = new LinkedList();
	
		list.add("Lily");
		list.add(new Integer(38));
		list.add(new Boolean(true));
		list.add(new Integer(38));
		System.out.println(list);
		       
		list.set(0,"Nana");
        System.out.println();
        System.out.println("Replace����������X����:");
        System.out.println(list);
        System.out.println("\n���o�l���X����:");
        System.out.println(list.subList(1,3));
        System.out.println();
               
        System.out.println("�HListIterator������ܥ������X����:");
        ListIterator itor = list.listIterator();
        
        while(itor.hasNext())
        {
            System.out.println(itor.next());
        }    
	}
}