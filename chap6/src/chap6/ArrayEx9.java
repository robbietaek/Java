package chap6;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {30,40,100};
		arr[2] = new int[] {50,60};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
