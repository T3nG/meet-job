package Unit14;
public class EX05_Throw
{
    public static void main(String[] args)
    {
        int value = 0;
          
        try {  
       
            if( value==0 )
                throw new ArithmeticException("�Ȭ�0");
        }
        catch( ArithmeticException e ){
       
            System.out.println("\n�ҥ~��]: " + e.getMessage()); 
            System.out.print("�ҥ~����: ");
            e.printStackTrace();
            System.out.println();
        }
        finally {
       
            System.out.println("�ҥ~�B�z����\n");
        }
       
        System.out.println("�{������");
    }
}