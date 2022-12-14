package Unit15.File;
import java.io.File;

public class EX01_FileMethod
{
	public static void myPrint(String s) 
	{
		System.out.print(s);
	}

	public static void main(String[] args)
	{
		// File file = new File("C:\\Java\\Work\\Ex801_FileMethod.java");  // �X�k�Y�i, �����s�b�r
		// File file = new File("D:\\JavaIDE\\Eclipse\\Workspace\\java01_jdk8\\src\\Unit15\\File\\Ex01_FileMethod.java");
		// File file = new File("Ex01_FileMethod.java");  // �䤣��O?
		File file = new File("src\\Unit15\\File\\Ex01_FileMethod.java");
		
		myPrint("�ɮצW�١G" + file.getName() + "\n");	       //���o�ɮצW��
		//myPrint("�ɮ׸��|�G" + file.getPath() + "\n");	   //���o�ɮ׸��|
		myPrint("������|�G" + file.getAbsolutePath() + "\n"); //���o������|
		myPrint("�ؿ���m�G" + file.getParent() + "\n");	   //���o�W�h�ؿ��W��
		myPrint("�ɮפj�p�G" + file.length() + " bytes\n");	   //���o�ɮפj�p
		myPrint("�̫�ק�G" + file.lastModified() + "\n");	   //���o�̫�ק�ɶ�
		
		myPrint("�O�_�s�b�G");
		myPrint(file.exists() ? "�s�b\n" : "���s�b\n");	       //�ˬd�O�_�s�b
		
		myPrint("�i�_Ū���G");
		myPrint(file.canRead() ? "�iŪ��\n" : "���iŪ\n");	   //�ˬd�O�_�iŪ��
		
		myPrint("�i�_�g�J�G");
		myPrint(file.canWrite() ? "�i�g�J\n" : "���i�g\n");	   //�ˬd�O�_�i�g�J
	}
}
