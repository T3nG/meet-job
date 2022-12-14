package Unit9;
public class U905_Dim3
{
    public static void main(String[] args) 
    {
        int x,y,z;
        for(x=1;x<=6;x++){
            for(z=1;z<=6-x;z++){
                System.out.print(" ");
            }
            for(y=1;y<=x*2-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}