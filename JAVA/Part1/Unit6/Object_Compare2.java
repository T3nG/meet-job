package Unit6;
public class Object_Compare2 
{
    
    public static void main(String[] args) 
    {
        String str1=new String("ABCDE");
        String str2=new String("ABCDE");
        
        System.out.println("str1 == srt2  ���G�� " + (str1==str2));
        System.out.println("str1.equals(str2)  ���G�� " + (str1.equals(str2)));
        System.out.println("str2.equals(str1)  ���G�� " + (str2.equals(str1)));
    }
}