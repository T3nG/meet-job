package Unit8;
import java.util.*;

public class U806_PrintList
{
	public static void main(String[] args)
	{
		//generic �x�� ArrayList<String> �ٲ��FString
		//���t�m4��, �Y�W�L�C���A��4��
        List<String> list = new ArrayList<>(4); 
        
		list.add("Lily");
		list.add("Lulu");
		list.add("Nana");
		list.add("Jojo");
		list.add("Anna");
		list.add("Diana");
		
		// for(Object s : ...  �䴩promotion���N�q
        for(String s : list) System.out.println(s);
	}
}