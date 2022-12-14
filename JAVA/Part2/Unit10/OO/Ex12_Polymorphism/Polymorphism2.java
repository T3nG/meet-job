package Unit10.OO.Ex12_Polymorphism;
abstract class Employee    //��¦���O
{
    private String name;
    private byte age;

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(byte age)
    {
        if(age > 20)
        {
            this.age=age;
        }
    }
    
    public byte getAge()
    {
        return age;
    }
      
    public abstract int getSalary();
}

class Manager extends Employee  //�������O Manager
{      
    public int getSalary()
    {
        return 65000;
    }
}

class Rector extends Employee  //�������O Rector
{      
    public int getSalary()
    {
        return 40000;
    }
}

class Secretary extends Employee   //�������O Secretary
{
    public int getSalary()
    {
        return 32000;
    }
}

public class Polymorphism2
{
    public static void main(String[] args)
    {
        Employee lily = new Manager();
        /*    
        Manager oo = new Manager();
        Employee lily = oo;
        */            
        
        System.out.println(lily.getSalary()); 
        
        Employee lulu = new Rector();     
        System.out.println(lulu.getSalary()); 

        Employee nana = new Secretary();     
        System.out.println(nana.getSalary()); 
        
    }
}  
