package Unit4;
public class U402_Printf
{
   public static void main(String args[])
   {
      int w=123;
      double x=456.785;
      char y='a';
      boolean z=true;
      String str="abcDEfg";
      
      System.out.printf("%d\n",w);
      System.out.printf("%5d\n",w);
      System.out.printf("%d         %d\n",w,w);
      System.out.printf("%d%12d\n",w,w);
      System.out.printf("%o\n",w);
      System.out.printf("%x\n",w);
      System.out.printf("%X\n",w);
      System.out.printf("%f\n",x);
      System.out.printf("%8.2f\n",x);
      System.out.printf("%c\n",y);
      System.out.printf("%C\n",y);
      System.out.printf("%2c\n",y);
      System.out.printf("%s\n",str);
      System.out.printf("%S\n",str);
      System.out.printf("%10s\n",str);
      System.out.printf("%b\n",z);
      System.out.printf("%B\n",z);
      System.out.printf("%10B%n",z);   
      System.out.printf("%-10s%n",str);
   }
   
} 









//System.out.printf("%3$d  %1$d   %2$d  %4$6.2f %n",10,20,30,123.4); 
