package Unit7.Math;
class MyTools
{
	static void showData()
    {
		System.out.println("�ڬOstatic method.");
		System.out.println("�s�Χ�: Class�W��.showData()");
	}
	
	void show()
	{
        System.out.println("�ڬOnon-static method.");
        System.out.println("�s�Χ�: Object�W��.showData()");
	}   
}


public class Method_Compare
{   
   public static void main(String[] args)
   {
	   System.out.println("�s�����O��k -");
	   MyTools.showData();
	   
	   System.out.println("\n");
	   System.out.println("�s�Ϊ����k -");
	   MyTools obj=new MyTools();
	   obj.show();
   }
}
