package Unit7.Math;
import java.util.Random;

public class Math_Random
{ 
    public static void main(String[] args) 
    {
    	int no;
        System.out.println("�ü�random(): " + Math.random());
        
        for(int x=1 ;x<=6 ;x++)
        {        
           no = (int)(Math.random()*49 + 1);     // 1-49���ü�
           System.out.println("1-49�ü�: " + no);
        }
        System.out.print("\n\n");
        //----------------------------------------------------
        
        Random oo = new Random();
        for(int x=1 ;x<=6 ;x++)
        {        
           no = oo.nextInt(49) + 1;     // 1-49���ü�
           System.out.println("1-49�ü�: " + no);
        }
        System.out.println();
    }
}