package Unit13.Regular.Matches;
public class StringMatches2 
{
    public static void main(String[] args) 
    {
        String str="�i�q���j";
        //String str="abcde";
        //String str="12345";
               
        if(str.matches("^[\u0391-\uFFE5]+$"))  //�c�餤��s�X�d��
            System.out.println("�O����");
        else
            System.out.println("���O����");
    }
}
