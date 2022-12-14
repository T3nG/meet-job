package Unit10.OO;
class Vehicle                    //Vehicle���O�ŧi                     
{
    private String carNo;         //���P���X                       
    private String owner;         //�Ҧ��H
   
    final String getNumber()
    { 
        return this.carNo;
    }
   
    final String getOwner() 
    {
        return this.owner; 
    }
   
    final void setNumber(String no) 
    {
        this.carNo = no; 
    }
   
    final void setOwner(String owner) 
    { 
        this.owner = owner; 
    }
}

final class Car extends Vehicle
{
    private int doors;
    public Car(String owner, String no, int doors)
    {
        setNumber(no);            //�I�s�����O����k
        setOwner(owner);
        this.doors = doors;   
    }
   
    public void printCar()       //����⨮���
    {
        System.out.println("====�⨮���====");
        System.out.println("�Ҧ��H: " + getOwner());
        System.out.println("�X��: " + doors);
        System.out.println("���P���X: " + getNumber()); 
    }    
}

//class SuperCar extends Car { }

public class Ex13_Final
{ 
    public static void main(String[] args) 
    {
        Car peugeot = new Car("Ted", "AFN-1019", 2);
        peugeot.printCar();
    }
}