package chapter3;
import java.util.Scanner;

public class selete {
	public static void main(String[] args){
		System.out.print("请输入要查找的字符串:");
		Scanner fw = new Scanner(System.in);
		String str = fw.next();
		String arr[]= new String[]{"嘉然","乃琳","向晚","贝拉","珈乐"};
		for(int i=0;i<4;i++){
			if(str.equals(arr[i])){
				System.out.print(str+" 的位置为"+i);
			}
		}
	}
}
