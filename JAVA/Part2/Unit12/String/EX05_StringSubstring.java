
import java.util.*;

public class EX05_StringSubstring
{ 
    public static void main(String[] args) 
    {
         String str1="Java language";
         String str2= new String("程式設計教學範例");
         
         System.out.println("測試的英文字串: \"" + str1 + "\"");
         System.out.println("測試的中文字串: \"" + str2 + "\"");
         System.out.println();
         //子字串和字元的處理
         System.out.println("英文字元charAt(3): " + str1.charAt(3));
         System.out.println("中文字元charAt(3): " + str2.charAt(3));
         System.out.println("英文字串substring(2): " + str1.substring(2));
         System.out.println("中文字串substring(2, 6): "+str2.substring(2, 6));
         System.out.println("取代英文字元replace('a', 'b'): " + str1.replace('a','b'));
         System.out.println("取代英文子字串replace(\"a\", \"b\"): " + str1.replace("a","b"));  
         System.out.println("取代英文子字串replace(\"a\", \"bc\"): " + str1.replace("a","bc"));  
                
         //結合兩字串
         String str3 = str1.concat(str2);
         System.out.println("結合英文字串與中文字串: " + str3);
         
         String str4 = str1+str2;
         System.out.println("結合英文字串與中文字串: " + str4);
         System.out.println();
         
         String[] music= {"搖滾音樂","流行音樂","爵士音樂","古典音樂","鄉村音樂"};
         String str5=String.join("-",music);  //類別方法
         System.out.println(str5);
         
         List<String> list= new ArrayList<>();
         list.add("搖滾音樂");
         list.add("流行音樂");
         list.add("爵士音樂");
         list.add("古典音樂");
         list.add("鄉村音樂");
         String str6=String.join("+++",list);  //類別方法
         System.out.println(str6);
    }
}