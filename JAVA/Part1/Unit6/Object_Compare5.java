package Unit6; 
public class Object_Compare5
{
    public static void main(String[] args)
    {
        Integer ageOfStudent = new Integer(25);
        Integer ageOfTeacher = new Integer(45);
		
        /*
        short x=25,y=45;
        Short ageOfStudent = new Short(x);
           
        Short ageOfTeacher = new Short(y);
   
        System.out.print("ageOfStudent  "); 
        */		
        switch( ageOfStudent.compareTo(ageOfTeacher) )
        {
           case -1:
              System.out.print("小於");
              break;
           case 0:
              System.out.print("等於");
              break;
           case 1:
              System.out.print("大於");
              break;
           default:
              System.out.print(ageOfStudent.compareTo(ageOfTeacher));
        }
        System.out.println("  ageOfTeacher"); 
     
   }
} 




      //System.out.println(new Character('E').compareTo(new Character('A')));
      
      //System.out.println(new Boolean(false).compareTo(new Boolean(true)));
         