/*
    jdk����Arrays.sort�ƧǤ�k
    Arrays.sort(�򥻸�ƫ��A�}�C) �Ѥp��j
    Arrays.sort(�򥻸�ƫ��A�}�C,index1,index2)
*/
package Unit8.Basic_Sort;
import java.util.Arrays;

public class Int_Sort 
{
	public static void main(String[] args) 
	{
		System.out.println("int�Ƨ�");
    	int[] num = { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    
    	System.out.print("�Ƨǫe:");
        for( int element : num ) System.out.print("\t"+element);
    	System.out.println("\n");
    	
    	Arrays.sort( num );  //�Ѥp��j
        //Arrays.sort( num,2 ,7 ); //�Ѥp��j
        
    	System.out.print("�Ƨǫ�:");
        for( int element : num ) System.out.print("\t"+element);
        System.out.println("\n"); 
	} 
}