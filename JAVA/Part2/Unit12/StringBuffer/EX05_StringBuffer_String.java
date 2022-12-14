
public class EX05_StringBuffer_String
{ 
    public static void main(String[] args) 
    {
        StringBuilder str1 = new StringBuilder("Java程式語言教學範例");
        
        String str2 = new String("Java程式語言教學範例");
        
        String str3 = new String(str1);
        System.out.println("StringBuffer字串 str1   :  " + str1);
        System.out.println("String字串 str2   :  " + str2);
        System.out.println("String字串 str3   :  " + str3);
        System.out.println();
        
        System.out.println( "str1.equals(str2) :" + str1.equals(str2));

        System.out.println( "str1.toString().equals(str2) :" + str1.toString().equals(str2));

        System.out.println( "str3.equals(str2) :" + str3.equals(str2));
        System.out.println();
    }
}
