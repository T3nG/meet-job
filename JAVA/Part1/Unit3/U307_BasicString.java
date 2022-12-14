package Unit3;
public class U307_BasicString
{  
   public static void main(String args[])
   {
        String str1="ABCDE";
        String str2=new String("ABCDE");
        
        char[] c = {'A','B','C','D','E'};
        String str3=new String(c);
        
        byte[] b = {97,98,99,100,101,102,103,104};
        String str4=new String(b);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();                      
   }
}  