
import java.awt.*;

public class MyFrame4 extends Frame
{
    //¦Û­q«Øºc¦¡
    public MyFrame4(String title,Color bgcolor)
    {
        this.setTitle(title); 
        this.setBackground(bgcolor);   
    }     
    
    public static void main(String[] args)
    {
        MyFrame4 frm=new MyFrame4("Hello", Color.RED);
        
        frm.setSize(800,500);
        frm.setLocation(200,150);
        
        frm.setVisible(true);       
    }
}  
