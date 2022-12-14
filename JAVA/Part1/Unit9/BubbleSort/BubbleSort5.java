package Unit9.BubbleSort;
public class BubbleSort5
{
    public static void main(String[] args) 
    {
        int x, y;
        int[] ary = {15, 8, 25, 48, 2, 10};
        //int[] ary = {2, 8, 10, 15, 25, 48};
        //int[] ary = {8, 10, 2, 25, 15, 48};
        
        System.out.println("原始陣列:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.println("\n\n");
        
        //改良 BubbleSort 排序的次數變少了
        //n筆資料原本需排 (n-1)^2 次, 改良後只需排 n(n-1)/2 次
        
        for( x = 1; x < ary.length; x++ ){        // x <= ary.length-1  
        	int idx = 0;						  // 用以儲存未排列的次數
        	for( y = 0; y < ary.length-x; y++ ){  
        		if(ary[y] > ary[y+1]){            // swap 前後元素的內容 , > 遞增, < 遞減
        			int tmp;
        			tmp = ary[y];
        			ary[y] = ary[y+1];
        			ary[y+1] = tmp;
        		}
        		else							  // 若未排列, idx + 1
        			idx++;
        	}
      
        System.out.println("第"+(x)+"輪的結果:");
           
        for(int num : ary) System.out.print(num + "  ");
           
        System.out.print("------> " + (y) + " 次");   
        System.out.println();
            
        // 檢查是否已完成排序, 當未排列次數等於 y 次, 代表已完成排序
        if(idx==y)
        	break;
        }
        
        System.out.println("\n\n\n排序後的結果:");
        
        for(int num : ary) System.out.print(num + "  ");
        
        System.out.println();
    }
}