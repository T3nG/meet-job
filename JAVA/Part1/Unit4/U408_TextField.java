package Unit4;
import java.awt.*;

public class U408_TextField
{  
   public static void main(String args[])
   {
      Frame frm=new Frame("TextField"); 
      TextField txf1=new TextField("��Ū����r���");
      TextField txf2=new TextField();
      TextField txf3=new TextField();
   
      frm.setSize(300,250);
      frm.setLocation(300,250);
      frm.setLayout(null);
      frm.setBackground(Color.yellow);
      txf1.setBounds(90,60,120,30);
      txf2.setBounds(90,100,120,30);
      txf3.setBounds(90,140,120,30);
      
      txf1.setEditable(false);    //�]�wtxf1�����i�s��
      txf3.setEchoChar('*');      //�]�wtxf3���^���r����'*'
      
      frm.add(txf1);
      frm.add(txf2); 
      frm.add(txf3); 
      frm.setVisible(true); 
   }
}
