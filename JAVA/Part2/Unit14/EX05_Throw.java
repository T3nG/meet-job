package Unit14;
public class EX05_Throw
{
    public static void main(String[] args)
    {
        int value = 0;
          
        try {  
       
            if( value==0 )
                throw new ArithmeticException("值為0");
        }
        catch( ArithmeticException e ){
       
            System.out.println("\n例外原因: " + e.getMessage()); 
            System.out.print("例外說明: ");
            e.printStackTrace();
            System.out.println();
        }
        finally {
       
            System.out.println("例外處理完成\n");
        }
       
        System.out.println("程式結束");
    }
}