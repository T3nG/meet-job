package Unit13.Regular.Replace;
public class Replace3 
{
    public static void main(String[] args) 
    {
        String str="AbbbbbBcccccB";
        System.out.println("原始字串:" + str + '\n');
        
        System.out.println("貪婪式:" + str.replaceAll("A.*B", "Orz"));
        System.out.println("保守式:" + str.replaceAll("A.*?B", "Orz"));           
    }
}
