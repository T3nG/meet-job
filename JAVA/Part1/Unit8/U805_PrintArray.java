package Unit8;
public class U805_PrintArray
{
	public static void main(String[] args)
	{
        int[] ary = {10, 12, 14, 16, 18};
        
        System.out.println("��X�}�C���Ҧ�����:");
        // for (long element : ...  �䴩promotion���N�q
        for(int element : ary)
        {
            System.out.println(element);
        } 
           
        System.out.println();
        
        for(int index=0; index<ary.length; index++)
        { 
            System.out.println(ary[index]);
        }    
    }
}