package chap18;

public class problem1 {

	public static void main(String[] args) {

		LambdaInterface3 f3;
		
		f3 = x -> {
			int sum=0;
			for(int i=x; i>=1; --i) {
				sum +=i;
			}
			System.out.println(sum);
		};
		f3.method(10);
		f3.method(100);
	}

}
