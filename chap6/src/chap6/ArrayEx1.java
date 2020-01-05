package chap6;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] arr1;
		int arr2[];
		arr1 = new int[5];
		arr2 = new int[6];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr2 = arr1;
		arr2[4]= 40;
		System.out.println("arr1 배열");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+ i + "]"+arr1[i]);
		}
		
		System.out.println("arr2 배열");
		for(int j=0; j<arr2.length;j++) {
			System.out.println("arr2 ["+j+"]"+arr2[j]);
		}
	}

}
