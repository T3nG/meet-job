package Unit4;
public class U410_IfElse 
{
    
    public static void main(String[] args) 
    {
        int score = 55;
        
        if( score >= 60 )
           System.out.println("及格");
        else
           System.out.println("不及格");
           
        String result= (score>=60) ? "及格" : "不及格";
        System.out.println(result);
    }
}