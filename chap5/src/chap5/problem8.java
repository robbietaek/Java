package chap5;

public class problem8 {
	public static void main(String[] args) {

		int sum = 0;


		for(int i=1;i<=10;i++) {
			System.out.print("(");
			
			for(int j=1;j<=i;j++) {
				sum+=j;
				System.out.print(j);
				
				if(j==i) continue;
				System.out.print("+");
				
		}
			
			System.out.print(")");
			
			if(i==10) break; {
				System.out.println("+");
		}
	}
		System.out.print("=");
		System.out.println(sum);
	}
}

