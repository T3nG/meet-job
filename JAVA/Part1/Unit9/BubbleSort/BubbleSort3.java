package Unit9.BubbleSort;
public class BubbleSort3
{
    public static void main(String[] args) 
    {
        int x, y;
        //int[] ary = {15, 8, 25, 48, 2, 10};
        int[] ary = {2, 8, 10, 15, 25, 48};
        //int[] ary = {8, 10, 2, 25, 15, 48};
        
        System.out.println("��l�}�C:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        //��} BubbleSort �ƧǪ������ܤ֤F
        //n����ƭ쥻�ݱ� (n-1)^2 ��, ��}��u�ݱ� n(n-1)/2 ��
        
        round:
        for( x = 1; x < ary.length; x++ ){        // x <= ary.length-1  
        	for( y = 0; y < ary.length-x; y++ ){  // y <= ary.length-1-x
        		if(ary[y] > ary[y+1]){            // swap �e�ᤸ�������e , > ���W, < ����
        			int tmp;
        			tmp = ary[y];
        			ary[y] = ary[y+1];
        			ary[y+1] = tmp;
        		}   
        	}
        	
            System.out.println("��"+(x)+"�������G:");
           
            for(int num : ary) System.out.print(num + "  ");
           
            System.out.print("------> " + (y) + " ��");   
            System.out.println();
            
            //�ˬd�O�_�w�����Ƨ�
            int index=0;
            for (int i=0;i<ary.length-1;i++) {
            	if(ary[i+1]>ary[i]) {			  // ���W�� > ; ����� <
            		index++;
            	}
            	if(index==ary.length-1) break round;
            }
        }
        
        System.out.println("\n\n\n�Ƨǫ᪺���G:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
    
}