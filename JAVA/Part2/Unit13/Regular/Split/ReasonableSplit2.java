//����r�ꪺ�X�z����
package Unit13.Regular.Split;
public class ReasonableSplit2
{ 
    public static void main(String[] args) 
    {
         String str= new String("�{���]�p�d��");
         System.out.println();
         System.out.println("���ժ�����r��: \"" + str + "\"");
         System.out.println();
         
         //�H�r�����B�z
         char[] ch;
         System.out.println("���Φ��r��:");
         ch = str.toCharArray();
         for ( char element : ch)
         {
            System.out.println(element );
         }
         System.out.println();
         
         //�ϥΤl�r�ꪺ�B�z�覡
         String[] substr;
         System.out.println("�H�Ŧr����Φ��l�r��:");
         substr = str.split("");
         for ( String element : substr )
         {
            System.out.println(element);
         }
    }
}