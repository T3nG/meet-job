package Unit17.List;
import java.util.*;

public class List03
{
	public static void main(String[] args)
	{
		List<String> v1 = new Vector<String>();
		v1.add("Lily");
		v1.add("Lulu");
		v1.add("Nana");
		v1.add("Diana");			
		System.out.println("���oVector���Ҧ�����:");
		System.out.println(v1);
		System.out.println();
        System.out.println("���o���windex==1������:");
		System.out.println(v1.get(1));
		System.out.println();
		
		System.out.println("Jojo���JVector:");
        List<String> v2 = new Vector<>();
		v2.add("Lily");
		v2.add(0,"Jojo");
		v2.add("Lulu");
        v2.add("Nana");
        v2.add("Diana");  
		System.out.println(v2);		
	}
}