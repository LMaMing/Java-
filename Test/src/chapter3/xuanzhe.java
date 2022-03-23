package chapter3;

public class xuanzhe {
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6};
		int i,j;
		//输出排序前
		System.out.print("选择排序前:");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//选择排序
		for (i = 0; i < arr.length - 1;i++){
			int max = i;
			for (j = i + 1; j < arr.length ; j++){
				if (arr[j]> arr[max] ) max = j;
				//交换
			int temp = arr[i];arr[i] = arr[max] ;arr[max] = temp;
			}
		}
		int n;
		System.out.print("选择排序后:");
		for (n = 0; n< arr.length; n++){
			System.out.print(arr[n]+" ");
		}
		
	}
}
