package chapter3;

public class copy {
	public static void main(String[] args){
		int arr1[] = new int[]{1,2,3};
		int arr2[] = new int[3];
		int len = arr1.length;
		for(int i=0;i< len;i++){
			arr2[i]=arr1[i];
		}
		for(int i=0;i<len;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}
