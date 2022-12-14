
public class EX06_StringSplit
{ 
    public static void main(String[] args) 
    {
         String str="Java language";
         String[] str1;
         String[] str2;
         char[] ch;
         byte[] by;
         System.out.println("測試的英文字串: \"" + str + "\"");
         System.out.println();
         
         //分割成子字串
         str1 = str.split("a");
         System.out.println();
         System.out.println("切除英文字串的a:");
         for(int x=0; x<str1.length; x++)
         {
            System.out.println(str1[x]);
         } 
         System.out.println();
         
         //分割成兩字串
         str2 = str.split(" ");
         System.out.println();
         System.out.println("切除英文字串的空白:");
         for(int x=0; x<str2.length; x++)
         {
            System.out.println(str2[x]);
         } 
         
         //分割成字元
         ch = str.toCharArray();
         System.out.println();
         System.out.println("將英文字串分割成字元:");
         for(int x=0; x<ch.length; x++)
         {
            System.out.print(ch[x]+"   ");
         } 
         System.out.println();
         
         //分割成byte
         by = str.getBytes();
         System.out.println();
         System.out.println("將英文字串分割成byte:");
         for(int x=0; x<by.length; x++)
         {
            System.out.print(by[x]+"  ");
         } 
         System.out.println("\n");
         
         System.out.println("刪除字串前後的空白:");
         String s1="    abcde fghij    ";
         String s2="  abcde";
         System.out.println(s1 + s2);
         System.out.println(s1.trim() + s2.trim());                
    }
}
