package Unit3;
public class U308_BasicString
{  
   public static void main(String args[])
   {
        String str1="ABCDE";
        String str2=new String("ABCDE");
                
        System.out.println("str1的長度: " + str1.length());
        System.out.println("str1的首字字元: " + str1.charAt(0)); 
        System.out.println("比較str1與str2的內容是否相同: " + str1.equals(str2)); 
        System.out.println();
        
        System.out.println("\n將字串還原成字元: ");
        char[] ary= str1.toCharArray();
        
        for( char element : ary ) System.out.println(element);

        System.out.println("\n將字串還原成byte: ");        
        byte[] ary2= str1.getBytes();
        
        for( byte element : ary2 ) System.out.println(element);
   }
}  