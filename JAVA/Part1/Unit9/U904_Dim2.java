package Unit9;
public class U904_Dim2
{
    public static void main(String[] args) 
    {
        int x, y;
        for( x=1; x<=6; x++ )
        {        
			for( y=1; y<=x*2-1; y++ )
			{
				System.out.print("*");
			}
              
			System.out.println();
        }
    }
}