package Unit5;
public class U504_Conditional 
{
    public static void main(String[] args) 
    {
        int a = 6;
        int b = 3;
        boolean x = a > b;
        boolean y = a == b; 
        
        System.out.println("x����B�⦡: " + x);
        System.out.println("y����B�⦡: " + y);
        
        System.out.println("NOT����B��: !x ���G�� " + (!x));
        System.out.println("AND����B��: x && y ���G�� " + (x && y));
        System.out.println("AND����B��: x & y ���G�� " + (x & y));
        System.out.println("OR����B��: x || y ���G�� " + (x || y));
        System.out.println("OR����B��: x | y ���G�� " + (x | y));
    }
	
}