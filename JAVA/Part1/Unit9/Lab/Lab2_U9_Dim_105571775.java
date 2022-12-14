package Unit9.Lab;

public class Lab2_U9_Dim_105571775
{
    public static void main(String[] args) 
    {
        int x,y;
        for(x=-5;x<=5;x++){
        	int absx = Math.abs(x);
            Space.spc(absx);
            
            for(y=1;y<=11-absx*2;y++){
            	if(y%2==0) 
            		System.out.print(" ");
            	else 
            		System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Space{
    public static void spc(int n){
        for (int z=1;z<=n;z++){
            System.out.print(" ");
        }
    }
}