package Unit9;

import com.ted.Space;

public class U908_Dim6
{
    public static void main(String[] args) 
    {
//    	int x,y;
//    	for(x=-5;x<=5;x++){
//    	    Space.spc(Math.abs(x));
//    	    for(y=1;y<=11-Math.abs(x)*2;y++){
//    	        System.out.print("*");
//    	    }
//    	    System.out.println();
//    	}

    	int x,y;
    	for(x=-5;x<=5;x++){
    	    int absx=Math.abs(x);
    	    Space.spc(absx);
    	    for(y=1;y<=11-absx*2;y++){
    	        System.out.print("*");
    	    }
    	    System.out.println();
    	}
    }
}
