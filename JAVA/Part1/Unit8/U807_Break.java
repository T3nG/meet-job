package Unit8;
public class U807_Break
{
   public static void main(String args[])
   {
      int x;

      for( x=1; x<=10; x++ )
      {
         if(x%7 == 0) break;
         
         System.out.println("x="+x);  
      }
      
      System.out.println("\nWhen loop interruped,x=" + x);
   }
}