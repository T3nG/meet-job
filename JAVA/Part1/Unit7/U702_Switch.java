package Unit7;
public class U702_Switch 
{
    public static void main(String[] args) 
    {
        int grade = 5;
        
        switch(grade)
        { 
           default:
             System.out.println("學生成績:不及格");
             break;
           case 5:
             System.out.println("學生成績:A");
             break;
           case 4:
             System.out.println("學生成績:B");
             break;
           case 3:
             System.out.println("學生成績:C");
             break;
           case 2:
             System.out.println("學生成績:D");
             break;             
        }
    }
}