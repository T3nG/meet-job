package Unit9.BubbleSort;
public class BubbleSort6
{
    public static void main(String[] args) 
    {
        int x, y;
        boolean sorted;
        //boolean sorted=true;	//�ˬd�O�_�w�Ƨ�,���ܼƪ���m�ݭn��b�Ĥ@���j�驳�U
        //int[] ary = {15, 8, 25, 48, 2, 10};
        //int[] ary = {2, 8, 10, 15, 25, 48};
        int[] ary = {8, 10, 2, 25, 15, 48};
        
        System.out.println("��l�}�C:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        //��} BubbleSort �ƧǪ������ܤ֤F
        //n����ƭ쥻�ݱ� (n-1)^2 ��, ��}��u�ݱ� n(n-1)/2 ��
        
        for( x = 1; x < ary.length; x++ ){        // x <= ary.length-1  
        	sorted=true;
        	for( y = 0; y < ary.length-x; y++ ){  
        		if(ary[y] > ary[y+1]){            // swap �e�ᤸ�������e , > ���W, < ����
        			int tmp;
        			tmp = ary[y];
        			ary[y] = ary[y+1];
        			ary[y+1] = tmp;
        			sorted=false;
        		}
        	}
      
        System.out.println("��"+(x)+"�������G:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.print("------> " + (y) + " ��");   
        System.out.println();
            
        // �Y�w�Ƨ�,�����j��
        if(sorted==true)
        	break;
//        if (sorted) 
//        	break;
//        ���ɪ� ==true �i�ٲ�
        }
        
        System.out.println("\n\n\n�Ƨǫ᪺���G:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
}