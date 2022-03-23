package chapter3;

public class maopao {
	public static void main(String[] args){
		int arr[] = new int[]{6,5,4,3,2,1};
		int i,j,temp;
		//打印冒泡前
		System.out.print("冒泡排序前：");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		//执行冒泡排序
		for (i = 0;i < arr.length -1 ; i++)
			for (j = 0; j < arr.length - 1 ;j++){
				if (arr[j] > arr[j + 1]){
					temp = arr[j]; arr[j] = arr[j+1];arr[j+1] = temp;
				}
			}
		
		//输出打印后结果
		System.out.print("冒泡排序后：");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
