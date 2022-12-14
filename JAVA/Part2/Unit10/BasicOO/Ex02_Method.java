package Unit10.BasicOO;
class Adder
{
    public static int sum_Class(int n) //���O��k
    {
        int total = 0;         
        for(int i=1; i<=n; i++)
        {
            total += i;
        }   
        return total;          
    }
   
    public int sum_Object(int n) //�����k
    {
        int total = 0;         
        for(int i=1; i<=n; i++)
        {
            total += i;
        }   
        return total;          
    }
}

class Ex02_Method
{
	public static void main(String[] args)
	{
        //�s�����O��k
        System.out.println("1+2+3+...+100 = " + Adder.sum_Class(100));

		//�s�Ϊ����k
	    Adder obj = new Adder();	           
        System.out.println("1+2+3+...+100 = " + obj.sum_Object(100));	
	}
}