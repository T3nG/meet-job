
public class Ex03_ToString
{ 
    public static void main(String[] args) 
    {
        String str1,str2;
        int x=123, y=456;
        
        //�ϥ�Number���O�����O��ktoString()�N�ƭ��ഫ���r��
        str1 = Integer.toString(x);
        str2 = Integer.toString(y);
        
        System.out.println(x + y);
        System.out.println(str1 + str2);
                       
        //�ϥ�String���O�����O��kvalueOf()�ഫ���r��
        String s5 = String.valueOf(1234);
        String s6 = String.valueOf(1.23);
    }
}