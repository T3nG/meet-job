
public class EX02_StringBufferAppend
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java程式語言教學範例"); 
        boolean boo = true;
        char[] chary = { 'V', 'W', 'X', 'Y', 'Z' };
        byte[] byary = { 65, 66, 67, 68, 69, 70 };
        System.out.println("原始字串 : " + str);
        System.out.println();
            System.out.println(str.length() + "/" + str.capacity());       
        //新增字串內容
        str.append(boo);  //布林值
        System.out.println("新增布林值   : " + str);
        str.append(chary);  //字元陣列
        System.out.println("新增字元陣列 : " + str);
        str.append(chary, 2, 3);  //字元陣列
        System.out.println("新增字元陣列 : " + str);
            System.out.println(str.length() + "/" + str.capacity());
/*        
        System.out.println();
        str.append(byary);
        System.out.println("新增byte陣列 : " + str);
        System.out.println();
*/        
        str.append(247);     //整數
        System.out.println("新增整數     : " + str);
        str.append(234.56);  //浮點數
        System.out.println("新增浮點數   : " + str);
            System.out.println(str.length() + "/" + str.capacity());        
        str.append("教學講義");
        System.out.println("新增字串     : " + str);
        str.reverse();  //反轉
        System.out.println("反轉字串     : " + str);
            System.out.println(str.length() + "/" + str.capacity());
    }
}