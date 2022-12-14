package Unit8;
public class U804_For
{   
    public static void main(String[] args) 
    {
        int a,b;
        
        for( a=1,b=3; a<=10 && b<=12; a++,b+=3 )
        {
            System.out.printf("a=%2d\tb=%2d\n",a,b);
        }
        
        System.out.printf("\n°j°éµ²§ô«á:\na=%2d\tb=%2d\n",a,b);
    }
}