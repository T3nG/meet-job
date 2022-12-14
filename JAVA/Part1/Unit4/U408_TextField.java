package Unit4;
import java.awt.*;

public class U408_TextField
{  
   public static void main(String args[])
   {
      Frame frm=new Frame("TextField"); 
      TextField txf1=new TextField("唯讀的文字方塊");
      TextField txf2=new TextField();
      TextField txf3=new TextField();
   
      frm.setSize(300,250);
      frm.setLocation(300,250);
      frm.setLayout(null);
      frm.setBackground(Color.yellow);
      txf1.setBounds(90,60,120,30);
      txf2.setBounds(90,100,120,30);
      txf3.setBounds(90,140,120,30);
      
      txf1.setEditable(false);    //設定txf1為不可編輯
      txf3.setEchoChar('*');      //設定txf3的回應字元為'*'
      
      frm.add(txf1);
      frm.add(txf2); 
      frm.add(txf3); 
      frm.setVisible(true); 
   }
}
