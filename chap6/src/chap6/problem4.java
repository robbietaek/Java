package chap6;

public class problem4 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i =0; i<10; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}

		for(int j = 0; j<num.length;j++) {
			for(int k = 0; k<num.length-1;k++) {
				if(num[k]>num[k+1]) {
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
				}				
			}
		}
		for(int a : num)
		System.out.print(a+",");
	}

}
