// ��X Map
package Unit17.Map;
import java.util.*;

public class Map07
{
	public static void main(String[] args)
	{
        Map<String, String> map = new TreeMap<>();    
        map.put("key1", "Lily");    
        map.put("key2", "Lulu");    
        map.put("key3", "Nana");
        map.put("key4", "Jojo");
        map.put("key5", "Anna");
        map.put("key6", "Diana");
        
        //�覡1�G    
        System.out.println("�H Map����.keySet ���o key�Mvalue�G");    
        for(String key : map.keySet()) 
        {    
            System.out.println("key= "+ key + " and value= " + map.get(key));    
        }    
        System.out.println();
        
        
        //�覡2    
        System.out.println("�H Map����.entrySet �ϥ� iterator ���o key�Mvalue�G");
        Set<Map.Entry<String, String>> set =  map.entrySet();        
        Iterator<Map.Entry<String, String>> it = set.iterator();
        
        //Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            
        while(it.hasNext()) 
        {    
            Map.Entry<String, String> entry = it.next();    
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
        }
        System.out.println();    
      
        
        //�覡3�G    
        System.out.println("�H Map����.entrySet ���o key�Mvalue");  
        for(Map.Entry<String, String> entry : map.entrySet()) 
        {    
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
        }    
        System.out.println();
        
        
        //�覡4    
        System.out.println("�H Map����.values() ���o �Ҧ���value�A��������o key");    
        for(String v : map.values()) 
        {    
            System.out.println("value= " + v);    
        } 
    }
}