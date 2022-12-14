
public class EX04_StringSearch
{ 
    public static void main(String[] args) 
    {
         String str1="Java 2";
         String str2= new String("程式設計教學範例");
         System.out.println("測試的英文字串: \"" + str1 + "\"");
         System.out.println("測試的中文字串: \"" + str2 + "\"");
         System.out.println();
         // 搜尋字元和子字串
         System.out.println("英文字元indexOf(\'a\'): " + str1.indexOf('a'));
         System.out.println("英文字元indexOf(97): " + str1.indexOf(97));
         System.out.println("英文字元lastIndexOf(97): " + str1.lastIndexOf(97));
         System.out.println("英文字元indexOf(\'a\', 2): " + str1.indexOf('a', 2));
         System.out.println("英文字元lastIndexOf(\'H\'): " + str1.lastIndexOf('H'));
         System.out.println("中文字串indexOf(\"範例\"): "+ str2.indexOf("範例"));
         System.out.println("中文字串lastIndexOf(\"範例\"): "+ str2.lastIndexOf("範例"));
         System.out.println("英文字串indexOf(\"2\", 1): "+ str1.indexOf("2", 1));
         System.out.println("英文字串lastIndexOf(\"a\", 2): "+ str1.lastIndexOf("a", 2));
         
         System.out.println("中文字串startsWith(\"範例\"): "+ str2.startsWith("範例"));
         System.out.println("中文字串startsWith(\"範例\",6): "+ str2.startsWith("範例",6));         
         System.out.println("中文字串endsWith(\"範例\"): "+ str2.endsWith("範例"));
    }
}
