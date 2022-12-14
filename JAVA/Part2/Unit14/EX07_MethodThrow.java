package Unit14;
class COther
{
    public static void div(int a,int b) throws ArithmeticException
    {   
       int c=a/b;
       System.out.println(a + "/" + b + "=" + c);  
    }    
}

public class EX07_MethodThrow
{
   public static void main(String[] args)
   {  
         try{  
         
            COther.div(4,0);  
         }
         catch(ArithmeticException e){} 
   }
}