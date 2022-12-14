
public class EX04_StringBufferDelete
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java程式語言教學範例");
        System.out.println("原始字串   :  " + str);
        System.out.println();
        //刪除字串內容
        str.deleteCharAt(4);
        System.out.println("刪除索引值4的字元      : " + str);
        System.out.println();
        str.delete(4,7);
        System.out.println("刪除索引值4到6的字串   : " + str);
        System.out.println();
        //取代字串內容
        str.setCharAt(5,'T');
        System.out.println("取代索引值5的字元      : " + str);
        System.out.println();
        str.replace(4,8,"語言教學實務");  
        System.out.println("取代索引值4到7的字串   : " + str);
        System.out.println();
        str.setLength(0);
        System.out.println("清除字串內容   : " + str);
    }
}
