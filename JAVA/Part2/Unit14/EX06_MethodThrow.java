package Unit14;
public class EX06_MethodThrow
{
    public static void div(int a,int b) throws ArithmeticException  //unchecked, ���B�z�]�i�H
    {
        int c;
        c=a/b;
        System.out.println(a + "/" + b + "=" + c);      
    }
     
    public static void main(String[] args)
    {  
        try{ 
         
            EX06_MethodThrow.div(4,0);
        }
        catch(ArithmeticException e){
         
            System.out.println("���ƬO0");  
        } 

/*          
        try{ 
         
            Thread.sleep(1000);  //�ɶ�������
        }
        catch(InterruptedException e){ }  // �Ochecked  ���B�z����
*/         
        
    }
}  