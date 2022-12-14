package Unit10.OO;
abstract class Shape        //Shape��H���O�ŧi                     
{
    public double x;                    
    public double y;
   
    abstract void area();    //��H��k: �p�⭱�n
    void getColor()
    {
        System.out.println("color is red");
    }
}

class Circle extends Shape  //Circle���O�ŧi
{
    public double r;         //�b�|
    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;   
    }
   
    public void area()       //��@��H��karea()
    {
        System.out.println("�ꭱ�n: " + Math.PI*r*r);
    }    
}

class Rectangle01 extends Shape  //Rectangle���O�ŧi
{
    private double x1;          //X�y��
    private double y1;          //Y�y��
    public Rectangle01(double x, double y, double x1, double y1)
    {
        this.x = x;      
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;   
    }
   
    public void area()
    {
        System.out.println("����έ��n: " + (y1-y)*(x1-x));
    }    
}
      
public class Ex11_Abstract
{ 
    public static void main(String[] args) 
    {
        Circle c1 = new Circle(5, 10, 400);
        System.out.println("=== ���c1����� ===");
        System.out.println("X�y��: " + c1.x);
        System.out.println("Y�y��: " + c1.y);
        c1.area();
        c1.getColor();
        System.out.println();
        
        Shape c2 = new Circle(5, 500, 400);
        System.out.println("=== ���c2����� ===");
        System.out.println("X�y��: " + c2.x);
        System.out.println("Y�y��: " + c2.y);
        c2.area();
        c2.getColor();
    }
}





        //System.out.println( c2 instanceof Shape );
        //System.out.println( c2 instanceof Circle );
