package Unit14; 
public class EX02_TryCatch
{
    public static void main(String[] args)
    {
        int i;
        try {  
       
            for(i=4; i>-2; i--) 
                System.out.println("�p�⵲�G: " + 12/i);
             
        }
        catch( ArithmeticException e ) {
            
            System.out.println();
            System.out.println("getMessage()�^�Ǫ���]: " + e.getMessage()); 
            System.out.println("toString()�^�Ǫ���]: " + e.toString());
            System.out.println();
            System.out.print("�ҥ~����: ");
            e.printStackTrace();
            System.out.println();
        }
        finally {
       
            System.out.println("�ҥ~�B�z����");
        }
       
        System.out.println("�{������!");
    }
}
