package Unit17.Set;
import java.util.*;

public class Set04
{
	public static void main(String[] args)
	{
		Set set = new HashSet();
		set.add("Lily");
		set.add("Nana");
		set.add("Lulu");
        set.add(null);   //�Nnull�[�J������
        System.out.println("�������X����:");
		System.out.println(set);
		System.out.println();
		
        //�HIterator�̧Ǩ��X���X�����Ҧ�����
        System.out.println("�������X����:");
		Iterator itor = set.iterator();
		while(itor.hasNext())
		{
			System.out.println(itor.next());
	    }
	    	
        System.out.println();
	    for(Object o: set)
	    {
            System.out.println(o); 
        }  
	}
}