package chapter3;

public class xuanzhe {
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6};
		int i,j;
		//�������ǰ
		System.out.print("ѡ������ǰ:");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//ѡ������
		for (i = 0; i < arr.length - 1;i++){
			int max = i;
			for (j = i + 1; j < arr.length ; j++){
				if (arr[j]> arr[max] ) max = j;
				//����
			int temp = arr[i];arr[i] = arr[max] ;arr[max] = temp;
			}
		}
		int n;
		System.out.print("ѡ�������:");
		for (n = 0; n< arr.length; n++){
			System.out.print(arr[n]+" ");
		}
		
	}
}
