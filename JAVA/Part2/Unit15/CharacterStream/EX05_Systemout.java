package Unit15.CharacterStream;
import java.io.*;

public class EX05_Systemout
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter output = new BufferedWriter(
                                    new OutputStreamWriter(System.out));
                      
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        output.write(str);       //��X�r��
        output.newLine();
        output.write(str,3,10);
        output.newLine();
        output.close();          //���� Stream
    }
}
