/* 篶ㄓ﹚妮┦ */
package Unit10.BasicOO;

class ShowDate   //﹚竡ShowDate摸
{
    private int year;   //
    private int month;  //る
    private int day;    //ら计
   
    public void printDate()
    {
        System.out.println(year + "-" + month + "-" + day);
        System.out.println();
    }
   
    public ShowDate()                              //篶1:礚把计
    {
//        this.year=2016;
//        this.month=10;
//        this.day=19;
    	// int x=10;  X ノㄤ篶, 材ゲ斗琌ノ痹瓃
        this(2016,10,19);
        // int x=10;  O
    }
   
    public ShowDate(int day)                       //篶2:Τら计把计
    {
//        this.year=2016;
//        this.month=10;
//        this.day=day;
        this(2016,10,day);
    }
    
    public ShowDate(int month, int day)            //篶3:Τら计る把计
    {
//        this.year=2016;
//        this.month=month;
//        this.day=day;
        this(2016,month,day);
    }
   
    //ぃ癸秨篶
    private ShowDate(int year, int month, int day) //篶4:Τら计る把计
    {
        this.year=year;
        this.month=month;
        this.day=day;     
    }
}

public class Ex08_Constructor
{ 
    public static void main(String[] args) 
    {
        
        ShowDate day1,day2,day3,day4;
        
        day1 = new ShowDate();
        day1.printDate();
        
        day2 = new ShowDate(10);
        day2.printDate();
        
        day3 = new ShowDate(10,19);
        day3.printDate();
        
        //day4 = new ShowDate(2015,10,19);
        //day4.printDate();
    }
}