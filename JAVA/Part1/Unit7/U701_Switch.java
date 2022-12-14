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
             System.out.println("成績 A");
                
           case 'B':
             System.out.println("成績 B");

           case 'C':
             System.out.println("成績 C");
             
           case 'D':
             System.out.println("成績 D");
           
           default:
             System.out.println("成績 不及格");
             
        }
    }
}