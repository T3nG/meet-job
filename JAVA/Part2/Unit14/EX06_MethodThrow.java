package Unit14;
public class EX06_MethodThrow
{
    public static void div(int a,int b) throws ArithmeticException  //unchecked, 不處理也可以
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
         
            System.out.println("除數是0");  
        } 

/*          
        try{ 
         
            Thread.sleep(1000);  //時間的延遲
        }
        catch(InterruptedException e){ }  // 是checked  不處理不行
*/         
        
    }
}  