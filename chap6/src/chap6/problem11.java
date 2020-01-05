package chap6;

public class problem11 {

	public static void main(String[] args) {
		

		int[][] arr = {{10,20},{30,40,50},{60,70,80,90}};
		
		int[] hang = new int[arr.length];			
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(sum<arr[i].length) {
				sum = arr[i].length;
			}
		}
		
		int[] yeol = new int[sum];
		
		for(int i=0;i<arr.length;i++) {				
			for(int j=0;j<arr[i].length;j++) {
				hang[i] += arr[i][j];
				yeol[j] += arr[i][j];				
			}
		}
		
		for(int i=0; i<hang.length;i++) {
			System.out.println(i+"행의 합 : "+hang[i]);

		}
		
		for(int i = 0; i<yeol.length;i++) {
			System.out.println(i+"열의 합 : "+yeol[i]);
		}
		

	}

}
