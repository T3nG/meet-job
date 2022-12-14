/* �H�غc�ӫ��w�ݩʪ���� */
package Unit10.BasicOO;

class ShowDate   //�w�qShowDate���O
{
    private int year;   //�~��
    private int month;  //���
    private int day;    //���
   
    public void printDate()
    {
        System.out.println(year + "-" + month + "-" + day);
        System.out.println();
    }
   
    public ShowDate()                              //�غc1:�L�Ѽ�
    {
//        this.year=2016;
//        this.month=10;
//        this.day=19;
    	// int x=10;  X �s�Ψ�L�غc��, �Ĥ@�C�����O�s�Ϊ��ԭz
        this(2016,10,19);
        // int x=10;  O
    }
   
    public ShowDate(int day)                       //�غc2:�u����ưѼ�
    {
//        this.year=2016;
//        this.month=10;
//        this.day=day;
        this(2016,10,day);
    }
    
    public ShowDate(int month, int day)            //�غc3:����ơB����Ѽ�
    {
//        this.year=2016;
//        this.month=month;
//        this.day=day;
        this(2016,month,day);
    }
   
    //����~�}�񪺫غc
    private ShowDate(int year, int month, int day) //�غc4:����ơB����B�~���Ѽ�
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