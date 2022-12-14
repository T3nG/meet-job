package Unit10.BasicOO;
class Rect
{
    private int width;   // �ݩ�       
    private int length; 
      
    public void setWidth(int wd)
    {
        width=wd;
    }
    
    public void setLength(int len)
    {
        length=len;
    }
    
    public int area()         // �w�q��karea(), �Ψӭp�⭱�n
    {
        return width * length;
    }
   
    public int perimeter()    // �w�q��kperimeter(), �Ψӭp��P��
    {
        return (width + length) * 2;
    }
}

class Ex01_Rectangle
{
    public static void main(String args[])
    {
        Rect r = new Rect();
 
        r.setWidth(10);    
        r.setLength(5);    
      
        System.out.println("���n=" + r.area());
        System.out.println("�P��=" + r.perimeter());
    }
}