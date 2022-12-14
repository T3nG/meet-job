
public class EX07_StringAttention
{ 
    public static void main(String[] args) 
    {        
        String str="";

        str=str + "abcd";
        
        if(str.equals("abcd"))
        {
            System.out.println("內容相同");
        }
        else
        {
            System.out.println("內容不同");
        }
        
        System.out.println(str);
    }
}
