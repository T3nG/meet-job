package Unit14;
public class EX03_MultiCatch
{
    public static void main(String[] args)
    {
        int i;
        
        try {  
       
            String str = args[0];  // ���ͶW�L�}�C�d��ҥ~, �bcmd�Ҧ��U�]�Ѽ�1 => args[0]
          
            for(i=3; i>-2; i--)
                System.out.println("�p�⵲�G: " + 6/i);
        }
        catch( ArithmeticException e ) {
       
            //�B�z���Ƭ��s
            System.out.println("\n�ҥ~��]: " + e.getMessage()); 
            System.out.print("�ҥ~����: ");
            e.printStackTrace();
            System.out.println();
          
        }
        catch( ArrayIndexOutOfBoundsException e ) {
       
            //�B�z�W�L�}�C���޽d��
            System.out.println("\n�ҥ~��]: " + e.getMessage()); 
            System.out.print("�ҥ~����: ");
            e.printStackTrace();
            System.out.println();
        }
        catch( IndexOutOfBoundsException e ) {
       
            //�B�z���޶W�L�d��
            System.out.println("\n�ҥ~����: " + e.getMessage()); 
            System.out.print("�ҥ~��]: ");
            e.printStackTrace();
            System.out.println();
        }
        catch( Exception e ){}
        finally {
       
            System.out.println("�ҥ~�B�z����\n");
        }
       
        System.out.println("�{������!");
    }
}