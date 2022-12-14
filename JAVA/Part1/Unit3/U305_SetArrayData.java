package Unit3;
public class U305_SetArrayData
{
	public static void main(String[] args)
	{
	    int[] ary1 = new int[5];
	    ary1[0] = 10;
	    ary1[1] = 12;
        ary1[2] = 14;
        ary1[3] = 16;
        ary1[4] = 18;
        
        //亦可採用如下的寫法
        int[] ary2 = {10, 12, 14, 16, 18, 20};  // Java SE、Java EE
        
        int[] ary3 = new int[]{10, 12, 14, 16, 18, 20, 22, 24};  // Java ME
        
        System.out.println(ary1.length);
        System.out.println(ary2.length);
        System.out.println(ary3.length);
	}
}