package Unit6;
public class Object_Compare1 
{
    
    public static void main(String[] args) 
    {
        String str1="ABCDE";
        String str2="ABCDE";
        
        System.out.println("str1 == srt2  結果為 " + (str1==str2));
        System.out.println("str1.equals(str2)  結果為 " + str1.equals(str2));
        System.out.println("str2.equals(str1)  結果為 " + str2.equals(str1));
        
    }
}
