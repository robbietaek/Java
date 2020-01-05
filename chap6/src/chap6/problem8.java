package chap6;

public class problem8 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
				

			for(int i=1; i<=num1;i++) {
				if((num1%i==0)&&(num2%i==0)) {		
					System.out.print(i+",");
					}
				}
	}
}