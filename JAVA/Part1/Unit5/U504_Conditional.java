package Unit5;
public class U504_Conditional 
{
    public static void main(String[] args) 
    {
        int a = 6;
        int b = 3;
        boolean x = a > b;
        boolean y = a == b; 
        
        System.out.println("x條件運算式: " + x);
        System.out.println("y條件運算式: " + y);
        
        System.out.println("NOT條件運算: !x 結果為 " + (!x));
        System.out.println("AND條件運算: x && y 結果為 " + (x && y));
        System.out.println("AND條件運算: x & y 結果為 " + (x & y));
        System.out.println("OR條件運算: x || y 結果為 " + (x || y));
        System.out.println("OR條件運算: x | y 結果為 " + (x | y));
    }
	
}