
public class EX03_StringBufferInsert
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java程式語言教學範例");
        boolean boo = true;
        char[] chary = { 'W', 'X', 'Y', 'Z' };
        System.out.println("原始字串 : " + str);
        System.out.println();
        //插入字串內容
        str.insert(2, boo);                      //布林 
        System.out.println("布林值插入索引值2   : " + str);
        str.insert(0, 'C');                       //字元 
        System.out.println("字元插入索引值0     : " + str);
        str.insert(2, chary);
        System.out.println("字元陣列插入索引值2 : " + str);
        str.insert(6, chary, 1, 3);           //字元陣列 
        System.out.println("字元陣列部分元素插入索引值6 : " + str);
        str.insert(11, 247);                       //整數
        System.out.println("整數插入索引值11    : " + str);
        str.insert(15, 234.56);                    //浮點數
        System.out.println("浮點數插入索引值15  : " + str);
        str.insert(5, "教學講義");
        System.out.println("字串插入索引值5     : " + str);
    }
}
