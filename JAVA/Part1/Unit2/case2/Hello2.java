//叫用com.lccnet.SayHi

package kuo;

import com.lccnet.SayHi;

public class Hello2
{
   public static void main(String args[])
   {
      System.out.println("I'm Hello2!\n");
      System.out.println("我要叫用com.lccnet.SayHi\n");
      SayHi said=new SayHi(); 
      //com.lccnet.SayHi said=new com.lccnet.SayHi(); 
      said.show();
   }
}  

