package Unit7;
public class U701_Switch 
{
    public static void main(String[] args) 
    {
        char grade = 'B';
        //int grade = 66;    
        //String grade = "B";
        
        switch(grade)
        {            
           case 'A':
             System.out.println("���Z A");
                
           case 'B':
             System.out.println("���Z B");

           case 'C':
             System.out.println("���Z C");
             
           case 'D':
             System.out.println("���Z D");
           
           default:
             System.out.println("���Z ���ή�");
             
        }
    }
}