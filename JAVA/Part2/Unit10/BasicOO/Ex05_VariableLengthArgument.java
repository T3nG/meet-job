package Unit10.BasicOO;
public class Ex05_VariableLengthArgument
{ 
    public static int sum(int ... nums) //�ۦP���A���s�հѼ�   
    {
        int total = 0;
        for( int x = 0; x < nums.length; x++ )
        {
            total += nums[x];
        }
        return total;
    }
         
    public static void main(String[] args) 
    {
        System.out.println("1+2 = " + sum(1,2));
        System.out.println("1+2+3 = " + sum(1,2,3));
        System.out.println("1+2+3+4 = " + sum(1,2,3,4));
        System.out.println("1+2+3+4+5 = " + sum(1,2,3,4,5));
    }
}