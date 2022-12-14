
package tw.com.lccnet;   //自訂套件路徑

import java.awt.Frame;

public class MyTools extends Frame
{
   public static final int COUNT=10;  //常數
   public int number;  //屬性
   public int min;
   public int max;
   public int x;
   
   public void setNumber(int number)
   {
       int x=10;      //區域變數
       this.number=number;
   }
    
   public int getNumber()
   {
       int x=20;      //區域變數
       return this.number;
   }        
   
   //列註解
   public void showA()
   {
      System.out.println("test1 !!"); //列註解
   }
   
   /* 傳統式註解
      又稱為多列式註解 */
   public void showB()
   {
      System.out.println("test2 !!");
   }
   
   /** 在程式中做為傳統式的註解，
       當製作documentation時，此
       註解的內容會自動加入說明文件 */
   public void showC()
   {
      System.out.println("test3 !!");
   } 
}  
