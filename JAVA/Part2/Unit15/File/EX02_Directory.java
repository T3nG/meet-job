package Unit15.File;
import java.io.File;

public class EX02_Directory
{
	public static void myPrint(String s)
	{
		System.out.print(s);
	}
	
	public static void main(String[] args)
	{
		String path = "C:/Jdk8";	//�w�q�u�@���|
		File file = new File(path);	//�إ��ɮ����O
        if(file.isDirectory())        //���լO�_���ؿ�
		{	
            myPrint("�ɮ׸��| " + path + "\n"); //��ܤu�@���|
			String s[] = file.list();	//���o�ؿ������������
			for(int i=0; i<s.length; i++)
			{
				File fn = new File(path + "/" + s[i]);	//�إ߸��|�P�ɦW����
                if(fn.isDirectory())  //�ˬd�O�_���ؿ�
				{	
                    myPrint(s[i] + " �O�ؿ�\n");
				}
				else
				{
                    myPrint(s[i] + " �O�ɮ�\t");
                    
                    myPrint("�ɮפj�p�G" + new File(path + "/" + s[i]).length() + "Bytes\n");
				}
			}
		}
		
		System.out.println("�L���ؿ�!");
	}
}
