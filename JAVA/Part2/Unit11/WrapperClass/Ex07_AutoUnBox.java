 
public class Ex07_AutoUnBox
{
    public static void main(String[] args)
    {
        Integer ref = 10;  
         
        int x = ref;      //Autounboxing

        System.out.println(x * 10);
            
        System.out.println(ref.intValue() * 10);   //Jdk5.0�H�e���g�k
           
        System.out.println(ref * 10);  //Jdk5.0�H�᪺�g�k     
    }
}
          