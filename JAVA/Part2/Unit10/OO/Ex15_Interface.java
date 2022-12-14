package Unit10.OO;
interface IShape
{
    static final double PI=Math.PI;
    abstract void area();
}

interface IColor
{
    abstract void setColor(String str);
}

class CCircle implements IShape,IColor  //��@IShape�PIColor����
{
    double radius;
    String color;
   
    public CCircle(double r)
    {
        radius=r;
    }
 
    public void area()
    { 
        System.out.println("���n=" + PI*Math.pow(radius,2.0));      
    }
   
    public void setColor(String str)
    {  
        color=str;
        System.out.println("�C��=" + color); 
    }
}

public class Ex15_Interface
{
    public static void main(String args[])
    {
        CCircle cir;
        cir=new CCircle(14.0); 
        cir.setColor("Blue");
        cir.area();
   }
}





//interface ALL extends IShape,IColor {}

