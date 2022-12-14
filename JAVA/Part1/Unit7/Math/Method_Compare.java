package Unit7.Math;
class MyTools
{
	static void showData()
    {
		System.out.println("我是static method.");
		System.out.println("叫用我: Class名稱.showData()");
	}
	
	void show()
	{
        System.out.println("我是non-static method.");
        System.out.println("叫用我: Object名稱.showData()");
	}   
}


public class Method_Compare
{   
   public static void main(String[] args)
   {
	   System.out.println("叫用類別方法 -");
	   MyTools.showData();
	   
	   System.out.println("\n");
	   System.out.println("叫用物件方法 -");
	   MyTools obj=new MyTools();
	   obj.show();
   }
}
