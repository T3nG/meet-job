//�^��r�ꪺ�X�z����
package Unit13.Regular.Split;
public class ReasonableSplit1
{ 
    public static void main(String[] args) 
    {
         String str1 = "Java language is good!";
         String str2 = "iabcloveebcyouwbcsotbcmuch";
         System.out.println();
         System.out.println("���ժ��^��r��1: \"" + str1 + "\"");
         System.out.println("���ժ��^��r��2: \"" + str2 + "\"");
         System.out.println();
         
         //�l�r�ꪺ�B�z
         String[] substr1;
         System.out.println("�H�ťդ��Φr��1:");
         substr1 = str1.split(" ");
         
         for ( String element : substr1 )
         {
            System.out.println(element);
         }
         System.out.println();
         
         
         String[] substr2;
         System.out.println("�H\".bc\"���Φr��2:");
         substr2 = str2.split(".bc");
         
         for ( String element : substr2 )
         {
            System.out.println(element);
         }
         System.out.println();
    }
}