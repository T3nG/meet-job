
public class EX08_StringCompare
{ 
    public static void main(String[] args) 
    {        
        String str1="ABCDEFGHIJ";

        String str2="ABCDE";
        
        System.out.println(str1.equals(str2));
        
        System.out.println(str1.compareTo(str2)); 
        //無不同字元時,採比較字串長度
    }
}