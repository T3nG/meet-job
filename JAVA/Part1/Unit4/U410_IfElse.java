package Unit4;
public class U410_IfElse 
{
    
    public static void main(String[] args) 
    {
        int score = 55;
        
        if( score >= 60 )
           System.out.println("�ή�");
        else
           System.out.println("���ή�");
           
        String result= (score>=60) ? "�ή�" : "���ή�";
        System.out.println(result);
    }
}