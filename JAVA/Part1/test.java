
public class test {
	public static void main(String[] args) {
//		double y = 655.445;
//		double z = 655.555;
//		
//		System.out.println(Math.floor(y));
//		System.out.println(Math.floor(z));
		
		int x,y;
	    for(x=1;x<=7;x+=3){
	        for(y=1;y<=9;y++){
	             System.out.printf("%d*%d=%2d  %d*%d=%2d  %d*%d=%2d\n",x,y,x*y,x+1,y,(x+1)*y,x+2,y,(x+2)*y);
	        }
	    System.out.println();
	    }
	}
}
