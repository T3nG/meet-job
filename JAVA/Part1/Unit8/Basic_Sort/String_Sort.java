//Arrays.sort���Ϊk
/*
    jdk����Arrays.sort�ƧǤ�k
    
    Arrays.sort(���O���A�}�C) �Ѥp��j
    Arrays.sort(���O���A�}�C, Collections.reverseOrder()) �Ѥj��p
*/
package Unit8.Basic_Sort;
import java.util.Arrays;
import java.util.Collections;

public class String_Sort 
{ 
    public static void main(String[] args) 
    {
        System.out.println("String�Ƨ�");
        String[] name = { "Lily", "Lulu", "Jojo", "Anna", "Diana", "Nana" };
    
        System.out.print("�Ƨǫe:");
        for (String element : name) System.out.print(element + "\t");

        System.out.println("\n");
      
        Arrays.sort(name);
        //Arrays.sort(name, Collections.reverseOrder());

        System.out.print("�Ƨǫ�:");
        for (String element : name)
        {
            System.out.print(element + "\t");
        }
        System.out.println("\n");  
    } 
}