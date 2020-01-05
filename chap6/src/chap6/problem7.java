package chap6;

public class problem7 {

	public static void main(String[] args) {

		
		for(String a : args) {
		int num = Integer.parseInt(a);
		
		
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}
			}
		System.out.println();
		}

	}

}
