package Unit5;
import java.util.*;

public class U507_IfIfElse 
{    
    public static void main(String[] args) 
    {
        int year,rem4,rem100,rem400;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J�~��: ");
        year = scanner.nextInt();
        System.out.println();

        rem4 = year % 4;
        rem100 = year % 100;
        rem400 = year % 400;
        
        /* �_��if */
        if(rem4 == 0)
        {

			/* �Ч������~�|�~���P�_ */

        }			
                              
    }
}


/*
 *  ���Vif (C/C++)
 *
    if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) 
        printf("%d�O�|�~\n", year);
    else 
        printf("%d�O���~\n", year);
*/