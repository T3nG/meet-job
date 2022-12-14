package Unit9;



public class U906_Dim4
{
    public static void main(String[] args) 
    {
        int x,y;
        for(x=1;x<=6;x++){
            Space.spc(6-x);
            for(y=1;y<=x*2-1;y++){
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