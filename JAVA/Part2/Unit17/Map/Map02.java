package Unit17.Map;
import java.util.*;

public class Map02
{
	public static void main(String[] args)
	{
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("ONE",new Integer(1));
		ht.put("TWO",2);
		ht.put("THREE",new Integer(3));
		ht.put("FOUR",4);
		ht.put("FIVE",new Integer(5));
		
		//�Hkey�ȱN���w�������X
        System.out.println("�Hkey�ȱN���w�������X");
		System.out.println("key=TWO:" + ht.get("TWO"));
		System.out.println("key=THREE:" + ht.get("THREE"));
		System.out.println("key=SIX:" + ht.get("SIX"));
		System.out.println();
		
        System.out.println("��ܶ��X���Ҧ��������e:"+ ht);
        
    }
}