package Unit15.ByteStream;
import java.io.*;

public class EX09_FileInputStream
{
	static void myPrint(String s)
	{	
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception
	{
		int size;
		FileInputStream file = new FileInputStream("EX09_FileInputStream.java");
		
        myPrint("�`�줸�ռơG" + (size = file.available()));//��ܦ줸���`��
        myPrint("Ū�� " + size + " �줸��....");        //���Ū�����줸�ռ�
		byte[] data = new byte[size];	            //�ŧi�O����w�ľ�
		
		if(file.read(data) != size)		            //�YŪ����� != size
		{
            myPrint("����Ū�� !");   
		}	
		
        myPrint(new String(data));         //���Ū�����
		file.close();
	}
}