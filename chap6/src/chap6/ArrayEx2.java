package chap6;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		for(int a : arr1) {
			System.out.println(a+",");
		}
		
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"]"+"="+arr1[i]);
		}
		System.out.println();
		
		
		arr1 = new int[]{100,200,300};
		
		for(int a : arr1) {
			System.out.println(a+",");
		}
		
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"]"+"="+arr1[i]);
		}
		System.out.println();
	}

}
