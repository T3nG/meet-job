package Unit7;
public class U702_Switch 
{
    public static void main(String[] args) 
    {
        int grade = 5;
        
        switch(grade)
        { 
           default:
             System.out.println("�ǥͦ��Z:���ή�");
             break;
           case 5:
             System.out.println("�ǥͦ��Z:A");
             break;
           case 4:
             System.out.println("�ǥͦ��Z:B");
             break;
           case 3:
             System.out.println("�ǥͦ��Z:C");
             break;
           case 2:
             System.out.println("�ǥͦ��Z:D");
             break;             
        }
    }
}