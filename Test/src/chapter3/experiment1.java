package chapter3;

public class experiment1 {
	public static void main(String[] args){
		int a = 5,b = 10;
		System.out.println("交换前a="+a+" b="+b);
		int temp = a; a = b; b = temp;  //完成交换
		System.out.println("交换后a="+a+" b="+b);
	}
}
