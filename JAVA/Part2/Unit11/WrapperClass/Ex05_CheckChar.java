
public class Ex05_CheckChar
{
    public static void main(String[] args)
	{
	    String s = "1234X6Y8";
	    //��ܩҦ���D�Ʀr�r�������ޭ�
	   
        int len = s.length();
       
        for( int n=0; n<len; n++ )
        {
            if(!Character.isDigit(s.charAt(n)))
            {
                System.err.println("���ޭ� " + n + " ���O�Ʀr�r��");
                //break;
            }
        }      
    }
}
