package chap6;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];
		
		arr[0][0] = 0;			arr[0][1] = 10;
		arr[1][0] = 20;			arr[1][1] = 30;
		arr[2][0] = 40;			arr[2][1] = 50;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+ arr[i][j] + "\t");
			}
					System.out.println();
		}
		
		System.out.println("°´Ã¼º¯°æ");
		int[] arr1 = {1,2,3,4,5};
		arr1[3] = 5000;
		arr[1] = arr1;

		
			for(int i= 0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length;j++) {
					System.out.print("arr["+i+"]["+j+"]="+ arr[i][j] + "\t");
				}
				System.out.println();
			}
			


	}

}
