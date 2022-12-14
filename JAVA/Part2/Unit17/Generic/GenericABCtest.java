package Unit17.Generic;
class GenericABC<k> 
{
    private k foo;
    public void setFoo(k foo)
    {
        this.foo=foo;
    }
    
    public k getFoo()
    {
        return this.foo;
    }
}

public class GenericABCtest
{
    public static void main(String[] args)
    {
        GenericABC<Boolean> obj1=new GenericABC<Boolean>();
        obj1.setFoo(new Boolean(true));
        Boolean x=obj1.getFoo();
        System.out.println(x);
        //==================================================
        GenericABC<Integer> obj2=new GenericABC<Integer>();
        obj2.setFoo(new Integer(123));
        Integer y=obj2.getFoo();
        System.out.println(y);
    }   
}