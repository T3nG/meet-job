
import java.io.*;

public class Lab_CheckID_AD_105571775{
    public static void main(String[] args) throws IOException{
    int c1, c2, total;
    String id;
    String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
    BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

    c1 = c2 = total = 0;         
    System.out.print("請輸入身分證字號:");
    id = keyin.readLine();

    if(id.length()!=10){
        System.err.println("長度不正確！");
        System.exit(0);
    }

    id = id.toUpperCase();
    c1 = chkid.indexOf(id.charAt(0));
    c2 = chkid.indexOf(id.charAt(1));
    
    if(c1<10){
        System.err.println("首字字元不正確！");
        System.exit(0);
    }

    if(c2<1 || c2>2){
        System.err.println("性別欄不正確！");
        System.exit(0);
    }
    
    // 檢查第3~第10個字元 
    for(int i=2;i<=9;i++) {
    	int cx = chkid.indexOf(id.charAt(i));
    	if(cx>=10 || cx<0){
    		System.err.println("數字字元不正確！");
    	    System.exit(0);
    	}
    }
    
    // 計算總合
    for(int i=1;i<=8;i++) {
    	total += chkid.indexOf(id.charAt(i))*(9-i);
    }
    total = total + chkid.indexOf(id.charAt(9))*1 + (c1/10)*1 + (c1%10)*9;
    
    if(total%10 != 0)
        System.out.println("不是身分證字號");
    else
        System.out.println("合理的身分證字號");
   }       
}

//    for(int i=1;i<=8;i++) {
//    	int c = Character.getNumericValue(id.charAt(i));
//    	total += c*(9-i);
//    }
//    total = total + Character.getNumericValue(id.charAt(9))*1 + (c1/10)*1 + (c1%10)*9;
//    
    
    // id.charAt() 為字元 char
    // 字元轉換, 轉成數字字串 Integer.parseInt(數字字串)
    // id.charAt()+""
    // id.substring(x, x+1)
    
    /*
    第2~9個字元
    Character.getNumericValue(id.charAt(1))*8
	Character.getNumericValue(id.charAt(2))*7
	Character.getNumericValue(id.charAt(3))*6
    Character.getNumericValue(id.charAt(4))*5
    Character.getNumericValue(id.charAt(5))*4
    Character.getNumericValue(id.charAt(6))*3
    Character.getNumericValue(id.charAt(7))*2
    Character.getNumericValue(id.charAt(8))*1
    
    檢查碼
    Character.getNumericValue(id.charAt(9))*1
    
    首字字母, 十位數字 取個位: 餘數 ; 取十位: 商數
	c1/10 => 取商數
	c1%10 => 取餘數
    */
