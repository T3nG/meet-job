package Unit15.ByteStream;
import java.io.*;

public class EX10_FileInOutStream
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fin=new FileInputStream("�{���y���ɽ�.pdf");
      FileOutputStream fout=new FileOutputStream("�{���y��.pdf"); 
           
      System.out.println("file size="+fin.available()); //�ɮפj�p
      byte data[]=new byte[fin.available()];  

      fin.read(data);      //�N����Ū�Jdata�}�C
      fout.write(data);    //�Ndata�}�C�̪���Ƽg�J�s�ɮ�
      System.out.println("file copyed and renamed");
      
      fin.close();
      fout.close();      
   }
}