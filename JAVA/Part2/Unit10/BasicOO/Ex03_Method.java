package Unit10.BasicOO;
public class Ex03_Method
{
    public static void myprint(String str)
    {
        System.out.print(str);
    }     

    public static void main(String[] args) 
    {
        int x, y;
        for ( x = 1; x <= 7; x+=3 )
        {        
            for ( y = 1; y <= 9; y++ )
            {
                Ex03_Method.myprint(x+"*"+y+"="+x*y+'\t');
              
                //�P�@�����O�i�H�ٲ����O�W��      
                myprint((x+1)+"*"+y+"="+(x+1)*y+'\t');
                myprint((x+2)+"*"+y+"="+(x+2)*y+'\n');
            } 
            myprint("\n");
        }
    }
}    
  
  
  
  
  
   
    
/*    
    public void methodA()
    {
        methodB();
    }
    
    public void methodB()
    {
        System.out.println("�s�Ϊ̬O methodA");
    }
*/        
