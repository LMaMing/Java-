package chapter3;

public class shiyan12 {
	public static void main(String[] args){
		int arr1[] = new int[]{1,2,3};
		System.out.print("arr1=");
		for (int j = 0 ; j < arr1.length ; j++){
			System.out.print(arr1[j]);
		}
		System.out.print("\n");
		int arr2[] = new int[3];
		//¸´ÖÆ
		for(int i=0;i < arr1.length;i++){
			arr2[i]=arr1[i];
		}
		//
		System.out.print("arr2=");
		for (int j = 0 ; j < arr1.length ; j++){
			System.out.print(arr2[j]);
		}
	}
}
