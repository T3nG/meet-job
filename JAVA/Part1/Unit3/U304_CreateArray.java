package Unit3;
public class U304_CreateArray
{
	public static void main(String[] args)
	{
        int[] ary1;
        ary1 = new int[10];
        
        double[] ary2;
        ary2 = new double[10];
        
        char[] ary3;
        ary3 = new char[10];
        
        boolean[] ary4;
        ary4 = new boolean[10];
        
        System.out.println("整數陣列預設初始值:   " + ary1[0]);
        System.out.println("浮點數陣列預設初始值: " + ary2[0]);
        System.out.println("字元陣列預設初始值:   " + ary3[0]);
        System.out.println("布林陣列預設初始值:   " + ary4[0]);
    }
}