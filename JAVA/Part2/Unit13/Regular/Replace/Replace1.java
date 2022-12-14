package Unit13.Regular.Replace;
public class Replace1 
{
    public static void main(String[] args) 
    {
        String str="fooAfooABfooABCfoo";
        System.out.println("��l�r��:" + str + '\n');
        
        String[] regexs = {".foo", ".?foo", ".*foo", ".+foo", "(A|B|C)foo"};
        for(String regex : regexs) 
        {
            System.out.println(str.replaceAll(regex, "Orz"));           
        }
    }
}


/*
 *  ^  : �}�l�ѭ��r�r��
 *  $  : �����b�̥��Ӧr��
 *
 *  .  : ���N�r��
 *  \d : 0~9
 *  \D : �D0~9
 *  \s : \t,\n,\f,\r,\x0B
 *  \S : �D\t,\n,\f,\r,\x0B
 *  \w : a~z,A~Z,0~9
 *  \W : �Da~z,A~Z,0~9
 *  \b : �ť�
 *
 *  x?     : x�X�{0~1�� (���ĥ�1��,�A��0��)
 *  x*     : x�X�{0~n�� (���ĥ�n��,�A����n-1��,...)
 *  x+     : x�X�{1~n��
 *  x{n}   : x�X�{n��
 *  x{n,m} : x�X�{n~m��
 *  [0-9]  : 0~9
 *  [^0-9] : �D0~9 
 *  [A-Z]  : A~Z
 *  [^A-Z] : �DA~Z
 *  (A|B|C)  : A��B��C  [ABC]
 */