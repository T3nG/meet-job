package Unit9.BubbleSort;
public class BubbleSort
{
    public static void main(String[] args) 
    {
        int x, y;
        int[] ary = {15, 8, 25, 48, 2, 10};
        //int[] ary = {2, 8, 10, 15, 25, 48};
        //int[] ary = {8, 2, 10, 25, 15, 48};
        
        System.out.println("��l�}�C:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        
        for( x = 1; x <= ary.length-1; x++ )
        {        
           for( y = 0; y < ary.length-1; y++ )
           {
              if(ary[y] < ary[y+1])  // swap �e�ᤸ�������e
              {
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
        }
        
        System.out.println("\n\n\n�Ƨǫ᪺���G:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
    
}