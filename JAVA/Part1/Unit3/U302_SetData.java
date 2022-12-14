package Unit3;
public class U302_SetData
{
  public static void main(String[] args)
  {
    byte a = 127;
    byte b = 0x7f;
    byte c = 0177;
    byte d = 0b0111_1111;
    //byte d=0b01_111_111;
    
    long e = 12345;
    long f = 220000000L;
    
    float g = 12345;
    float h = 1.0F;  // 1.0f
    
    boolean i = false;
    boolean j = true;
      
    //�r���X
    char chrAd = 65;	          
    char chrAo = 0101;
    char chrAx = 0x41;   //0X41
    char chtAb = 0b01000001;   //0B01000001
    
    //�r���`��
    char octA = '\101';
    char uniA = '\u0041';
    char constA = 'A' + 2;

    System.out.println("chrAd = " + chrAd);
    System.out.println("chrAo = " + chrAo);
    System.out.println("chrAx = " + chrAx);
    System.out.println("chtAb = " + chtAb);
    System.out.println("============");
    System.out.println("octA = " + octA);
    System.out.println("uniA = " + uniA);
    System.out.println("constA = " + constA);   
  }
}