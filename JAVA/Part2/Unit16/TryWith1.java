package Unit16;
class Resource implements AutoCloseable 
{
    void doSomething() throws Exception
    {
        System.out.println("Do something\n");
        //throw new Exception();
    }

    public void close() 
    {
        System.out.println("close()�Q�s�ΤF");
        System.out.println("�귽�Q����");
    }
}

public class TryWith1 
{    
    public static void main(String[] args) 
    {
        try(Resource res = new Resource()) 
        {
            res.doSomething();
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        
        System.out.println("�{������");
    }
    
}