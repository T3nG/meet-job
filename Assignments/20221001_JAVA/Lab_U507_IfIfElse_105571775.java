import java.util.*;

public class Lab_U507_IfIfElse_105571775
{    
    public static void main(String[] args) 
    {
        int year,rem4,rem100,rem400;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入年份: ");
        year = scanner.nextInt();
        System.out.println();

        rem4 = year % 4;
        rem100 = year % 100;
        rem400 = year % 400;
        
        /* 巢狀if */
        if(rem4 == 0){
            if(rem100 == 0){
                if(rem400 == 0){
                    System.out.print(year + "年是: 閏年");  //被 4 , 100 , 400 整除 (400,800,1200...)
                }
                else{
                    System.out.print(year + "年是: 平年");  //被 4 與 100 整除, 但不被 400 整除 (100,200,300,500...)
                }
            }
            else{
                System.out.print(year + "年是: 閏年");      //被 4 整除, 但不被 100 整除 (2012,2020,2024...)
            }
        }
        else{
            System.out.print(year + "年是: 平年");          //其他, 平年 (1997,1999,2011...)
        }
        scanner.close();			
    }
}
/** guard clause 
if(rem4 != 0){								// 不被4整除, 平年
	System.out.print(year + "年是: 平年");
	return;
}
if(rem100 != 0){							// 被4整除, 不被100整除, 閏年
	System.out.print(year + "年是: 閏年");
	return;
}
if(rem400 != 0){							// 被4整除, 被100整除, 平年
	System.out.print(year + "年是: 平年");
	return;
}
System.out.print(year + "年是: 閏年");		// 被4整除, 被100整除, 被400整除, 閏年
*/


/*
 *  雙向if (C/C++)
 *
    if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) 
        printf("%d是閏年\n", year);
    else 
        printf("%d是平年\n", year);
*/