package Unit17.List;
import java.util.*;

public class List05
{
   public static void main(String[] args) 
   {
      List<String> list = new ArrayList<>();
      String target = "Diana";
      list.add("Lily");  
      list.add("Lulu");
      list.add("Nana");
      list.add("Jojo");
  
      System.out.println("�e����������: " + list);
      System.out.println("�����Ӽ�:" + list.size());
      System.out.println("���J������:" + target);
  
      list.add(2, target);
      System.out.println("\n");
      System.out.println("��ܮe�������Ҧ�����\n");
      
      System.out.println("�覡1:for");     
      for( int i = 0; i < list.size(); i++ )
      {
         System.out.print(list.get(i)+ '\t');
      }   
      System.out.println();
      
      System.out.println("\n�覡2:Enhance for");
      for( String element : list )
      {
         System.out.print(element + '\t');
      }   
      System.out.println("\n");

      System.out.println("�j�M: " + target);
      System.out.println("indexOf():" + list.indexOf(target));
      System.out.println("lastIndexOf():" + list.lastIndexOf(target));
      
      list.set(3, "Anna");
      System.out.println("\n���N����3: " + list);
      
      list.remove(0);
      System.out.println("�R������0: " + list);
   }
}