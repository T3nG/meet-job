package Unit13.Regular.Split;
public class SpecialCharSplit 
{
    public static void main(String[] args) 
    {
    	String names="Lily cat Lulu cat Nana";
        System.out.println("���ժ��r��: \"" + names + "\"\n");
           	
        for(String str : names.split("\bcat"))  //����r��  
        {
            System.out.println(str.trim());
        }
        System.out.println();
        
        
        for(String str : names.split("\\bcat"))  //���h�r��  
        {
            System.out.println(str.trim());
        }
        System.out.println();
        
        String names2="Lily\tcat\nLulu\rcat\fNana";
        for(String str : names2.split("\\s"))  //����r��   
        {
            System.out.println(str);
        } 
        System.out.println();
        
        String names3="Lily.cat.Lulu.cat.Nana";
        for(String str : names3.split("\\."))  //�S��r��   
        {
            System.out.println(str);
        }         
               
    }
}


/*
 *java�����S��r��
.
$
^
{
[
(
|
)
*
+
?
\

*/