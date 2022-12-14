package Unit10.OO;
class Rectangle
{
	private int length, width;
	
	Rectangle() 
	{
		length = 0;
		width = 0;
	}
	
	Rectangle(int length, int width) 
	{
		this.length = length;	//�ݩ�=�Ѽƭ�
		this.width = width;	  
	}
	
	int getLength() 
	{
		return this.length;
	}
	
	int getWidth() 
	{
		return this.width;
	}
	
	int getArea() //���n 
	{
        return this.length*this.width;
        //return getLength()*getWidth();
    }
}

class Box extends Rectangle
{
	private int height;
	
    Box() 
	{
		super();  // �~�Ӥ����O�����e�k�s
		this.height = 0;
	}
	
    Box(int length, int width, int height)
	{
		super(length, width);	//�s�Τ�(��¦)���O���غc
		this.height = height;	
	}
	
	int getHeight() 
	{
		return this.height;
	}
	
	int getVolumn() //��n
	{
        return super.getLength()* super.getWidth()* this.getHeight();
        //return getLength()* getWidth()* height;
    }
}

public class Ex09_Inheritance
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		Box b2 = new Box(10,20,5);
		System.out.print("�c�l 1: �� = " + b1.getLength());	
        System.out.print(", �e = " + b1.getWidth());
        System.out.print(", �� = " + b1.getHeight());  
        System.out.println(", ��n = " + b1.getVolumn());
         
        System.out.print("�c�l 2: �� = " + b2.getLength());         
        System.out.print(", �e = " + b2.getWidth());        
        System.out.print(", �� = " + b2.getHeight());      
        System.out.println(", ��n = " + b2.getVolumn());
	}
}