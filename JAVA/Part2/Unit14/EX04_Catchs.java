package Unit14;
//7.0�����s�y�k:catch�i�H�X��

public class EX04_Catchs
{
    public static void main(String[] args)
    {
        int i;
        
        try {  
       
            String str = args[0];
          
            for(i=3; i>-2; i--)
                System.out.println("�p�⵲�G: " + 6/i);
        }
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e ) { /* �ҥ~�B�z */ }
       
        catch( IndexOutOfBoundsException e ){ /* �ҥ~�B�z */ }
       
        catch( Exception e ){}
       
        finally {
       
            System.out.println("�ҥ~�B�z����\n");
        }
       
        System.out.println("�{������!");
    }
}