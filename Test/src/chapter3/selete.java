package chapter3;
import java.util.Scanner;

public class selete {
	public static void main(String[] args){
		System.out.print("������Ҫ���ҵ��ַ���:");
		Scanner fw = new Scanner(System.in);
		String str = fw.next();
		String arr[]= new String[]{"��Ȼ","����","����","����","����"};
		for(int i=0;i<4;i++){
			if(str.equals(arr[i])){
				System.out.print(str+" ��λ��Ϊ"+i);
			}
		}
	}
}
