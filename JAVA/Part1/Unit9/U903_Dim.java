package Unit9;
public class U903_Dim
{
    public static void main(String[] args) 
    {
        int x, y;
        for( x=1; x<=6; x++ )
        {        
			for( y=1; y<=x; y++ )
			{
				System.out.print("*");
			}
              
			System.out.println();
        }
    }
}