package Unit13.Regular.Replace;
public class Replace3 
{
    public static void main(String[] args) 
    {
        String str="AbbbbbBcccccB";
        System.out.println("��l�r��:" + str + '\n');
        
        System.out.println("�g����:" + str.replaceAll("A.*B", "Orz"));
        System.out.println("�O�u��:" + str.replaceAll("A.*?B", "Orz"));           
    }
}
