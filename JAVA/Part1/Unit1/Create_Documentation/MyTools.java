
package tw.com.lccnet;   //�ۭq�M����|

import java.awt.Frame;

public class MyTools extends Frame
{
   public static final int COUNT=10;  //�`��
   public int number;  //�ݩ�
   public int min;
   public int max;
   public int x;
   
   public void setNumber(int number)
   {
       int x=10;      //�ϰ��ܼ�
       this.number=number;
   }
    
   public int getNumber()
   {
       int x=20;      //�ϰ��ܼ�
       return this.number;
   }        
   
   //�C����
   public void showA()
   {
      System.out.println("test1 !!"); //�C����
   }
   
   /* �ǲΦ�����
      �S�٬��h�C������ */
   public void showB()
   {
      System.out.println("test2 !!");
   }
   
   /** �b�{���������ǲΦ������ѡA
       ��s�@documentation�ɡA��
       ���Ѫ����e�|�۰ʥ[�J������� */
   public void showC()
   {
      System.out.println("test3 !!");
   } 
}  
