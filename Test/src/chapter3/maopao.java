package chapter3;

public class maopao {
	public static void main(String[] args){
		int arr[] = new int[]{6,5,4,3,2,1};
		int i,j,temp;
		//��ӡð��ǰ
		System.out.print("ð������ǰ��");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		//ִ��ð������
		for (i = 0;i < arr.length -1 ; i++)
			for (j = 0; j < arr.length - 1 ;j++){
				if (arr[j] > arr[j + 1]){
					temp = arr[j]; arr[j] = arr[j+1];arr[j+1] = temp;
				}
			}
		
		//�����ӡ����
		System.out.print("ð�������");
		for (i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
