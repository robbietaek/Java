package chap7;

public class FactorialEx {

	public static void main(String[] args) {

		System.out.println(factorial(10));

	}
	
	static int factorial(int i) {
		return(i==1)? 1:i*factorial(i-1);
	}

}
