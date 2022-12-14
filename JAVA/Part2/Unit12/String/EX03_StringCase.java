
public class EX03_StringCase
{ 
    public static void main(String[] args) 
    {
         String str1="Java programming language";
         String str2= new String("程式設計教學範例");
         // 顯示字串長度和大小寫轉換
         System.out.println("測試的英文字串: \"" + str1 + "\"");
         System.out.println("測試的中文字串: \"" + str2 + "\"");
         System.out.println();
         System.out.println("英文字串長度: " + str1.length());
         System.out.println("中文字串長度: " + str2.length());
         System.out.println();
         System.out.println("全部小寫: " + str1.toLowerCase());
         System.out.println("全部大寫: " + str1.toUpperCase());
    }
}
