package Unit8;
public class U808_Continue
{
   public static void main(String args[])
   {
      int x;

      for(x=1; x<=10; x++)
      {
         if(x%3 == 0) continue;
         
         System.out.println("x="+x); 
      }
      
      System.out.println("\nWhen loop finished,x="+x);
   }
}