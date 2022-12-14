package Unit13.Regular.Split;
public class SpecialCharSplit 
{
    public static void main(String[] args) 
    {
    	String names="Lily cat Lulu cat Nana";
        System.out.println("測試的字串: \"" + names + "\"\n");
           	
        for(String str : names.split("\bcat"))  //跳脫字元  
        {
            System.out.println(str.trim());
        }
        System.out.println();
        
        
        for(String str : names.split("\\bcat"))  //正則字元  
        {
            System.out.println(str.trim());
        }
        System.out.println();
        
        String names2="Lily\tcat\nLulu\rcat\fNana";
        for(String str : names2.split("\\s"))  //跳脫字元   
        {
            System.out.println(str);
        } 
        System.out.println();
        
        String names3="Lily.cat.Lulu.cat.Nana";
        for(String str : names3.split("\\."))  //特殊字元   
        {
            System.out.println(str);
        }         
               
    }
}


/*
 *java中的特殊字元
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