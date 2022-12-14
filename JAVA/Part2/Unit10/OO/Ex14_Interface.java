package Unit10.OO;
interface Constants
{
    int LINE=101;
	int RECTANGLE=102;
	int CIRCLE=103;
	int CURVE=104;
	void show();
}

class Element implements Constants
{
    public void show(){}
    
	String createElement(int element)
	{
		switch(element)
		{
			case Constants.LINE: 	
				return "���u";
            case Constants.RECTANGLE: 
				return "�����";
            case Constants.CIRCLE:  
				return "���";
            case Constants.CURVE:   
				return "���u";
			default: 	
				return "�L�Ϊ�";
		}
	}
}

public class Ex14_Interface
{
	public static void main(String args[]) 
	{
		Element element = new Element();
		System.out.println("�إ�" + element.createElement(101));
		System.out.println("�إ�" + element.createElement(102));
		System.out.println("�إ�" + element.createElement(103));
		System.out.println("�إ�" + element.createElement(104));
	}
}