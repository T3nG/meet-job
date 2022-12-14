package Unit10.BasicOO;
class Point                       
{
    int x,y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   
    void showPoint()
    {
        System.out.println("®y¼Ð:" + "(" + this.x + "," + this.y + ")");       
    }
}


class Ex07_This
{
    public static void main(String[] args)
    {
        Point p=new Point(100,200);
        p.showPoint();
        System.out.println("x="+p.x+"\ny="+p.y);
    }
}