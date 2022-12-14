
import java.util.*;

public class EX05_StringSubstring
{ 
    public static void main(String[] args) 
    {
         String str1="Java language";
         String str2= new String("�{���]�p�оǽd��");
         
         System.out.println("���ժ��^��r��: \"" + str1 + "\"");
         System.out.println("���ժ�����r��: \"" + str2 + "\"");
         System.out.println();
         //�l�r��M�r�����B�z
         System.out.println("�^��r��charAt(3): " + str1.charAt(3));
         System.out.println("����r��charAt(3): " + str2.charAt(3));
         System.out.println("�^��r��substring(2): " + str1.substring(2));
         System.out.println("����r��substring(2, 6): "+str2.substring(2, 6));
         System.out.println("���N�^��r��replace('a', 'b'): " + str1.replace('a','b'));
         System.out.println("���N�^��l�r��replace(\"a\", \"b\"): " + str1.replace("a","b"));  
         System.out.println("���N�^��l�r��replace(\"a\", \"bc\"): " + str1.replace("a","bc"));  
                
         //���X��r��
         String str3 = str1.concat(str2);
         System.out.println("���X�^��r��P����r��: " + str3);
         
         String str4 = str1+str2;
         System.out.println("���X�^��r��P����r��: " + str4);
         System.out.println();
         
         String[] music= {"�n�u����","�y�歵��","��h����","�j�孵��","�m������"};
         String str5=String.join("-",music);  //���O��k
         System.out.println(str5);
         
         List<String> list= new ArrayList<>();
         list.add("�n�u����");
         list.add("�y�歵��");
         list.add("��h����");
         list.add("�j�孵��");
         list.add("�m������");
         String str6=String.join("+++",list);  //���O��k
         System.out.println(str6);
    }
}