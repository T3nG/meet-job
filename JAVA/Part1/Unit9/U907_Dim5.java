package Unit9;

import com.ted.Space;

public class U907_Dim5
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
