
public class Ex02_ToValue
{ 
    public static void main(String[] args) 
    {
        String str1 = "123";
        String str2 = "456.78";
        

        /* �ϥ�Number���O��kparseXXX()�N�r���ഫ���ƭ� */
        int    n1 = Integer.parseInt(str1);
        
        double n2 = Double.parseDouble(str2);
        
        
        /* �ϥ�Number���O��kvalueOf()�N�r���ഫ��Number���� */
        int    n3 = Integer.valueOf(str1).intValue();
        //float  n3 = Integer.valueOf(str1).floatValue();
        double n4 = Double.valueOf(str2).doubleValue();
        
        System.out.println(str1 + str2);
        System.out.println(n1 + n2);
        System.out.println();
                               
        System.out.println(str1 + str2);
        System.out.println(n3 + n4);
    }
}