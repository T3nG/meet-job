
public class EX01_CreateString
{ 
    public static void main(String[] args) 
    {
        //建立陣列
        char[] charArray = { 'J', 'a', 'v', 'a', ' ', '2' };
        byte[] byteArray = { 74, 65, 86, 65, 32, 50 };   // J A V A   2
        StringBuffer strbuf=new StringBuffer("JSP動態網頁設計");
        
        String str1 = "Java程式設計";
        //使用建構建立字串物件
        String str2 = new String("Java程式設計");
        String str3 = new String(charArray);         //使用字元陣列
        String str4 = new String(byteArray);         //使用byte陣列
        String str5 = new String(strbuf);   
       
        System.out.println("String str1: " + str1);
        System.out.println();
        System.out.println("String(str2): " + str2);
        System.out.println();
        System.out.println("String(charArray): " + str3);
        System.out.println();
        System.out.println("String(charArray,1,3): " + new String(charArray,1,3));
        System.out.println();
        System.out.println("String(byteArray): " + str4);
        System.out.println();
        System.out.println("String(byteArray,2,4): " + new String(byteArray,2,4));
        System.out.println();
        System.out.println("String(StringBuffer): " + str5);
        
        /*
        String str6=strbuf.toString();  //將StringBuffer轉型String
        
        System.out.println("String: " + str6);
        */

    }
}
