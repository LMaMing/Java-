package chapter3;

public class experiment1 {
	public static void main(String[] args){
		int a = 5,b = 10;
		System.out.println("����ǰa="+a+" b="+b);
		int temp = a; a = b; b = temp;  //��ɽ���
		System.out.println("������a="+a+" b="+b);
	}
}
