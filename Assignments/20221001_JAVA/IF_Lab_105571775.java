public class IF_Lab_105571775
{
    public static void main(String[] args) 
    {
        int a=15,b=30,c=60; 
        if(a>b && a>c){
        	System.out.print("最大值為: " + a);
        }
        else if(b>a && b>c){
        	System.out.print("最大值為: " + b);
        }
        else{
        	System.out.print("最大值為: " + c);
        }
    }
}