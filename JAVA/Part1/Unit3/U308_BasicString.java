package Unit3;
public class U308_BasicString
{  
   public static void main(String args[])
   {
        String str1="ABCDE";
        String str2=new String("ABCDE");
                
        System.out.println("str1������: " + str1.length());
        System.out.println("str1�����r�r��: " + str1.charAt(0)); 
        System.out.println("���str1�Pstr2�����e�O�_�ۦP: " + str1.equals(str2)); 
        System.out.println();
        
        System.out.println("\n�N�r���٭즨�r��: ");
        char[] ary= str1.toCharArray();
        
        for( char element : ary ) System.out.println(element);

        System.out.println("\n�N�r���٭즨byte: ");        
        byte[] ary2= str1.getBytes();
        
        for( byte element : ary2 ) System.out.println(element);
   }
}  