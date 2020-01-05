import java.util.Scanner;

public class problem1 {
	/*
	 * 1. 두개의 수를 입력 받아 두수의 공약수를 구하기
	 * * [결과 1]
	 * 	 * 두개의 정수를 입력하세요
	 * 	 * 10 25
	 * 	 * 10과25의 공약수 :1,5
	 *  * 
	 * 	 * 
	 * [결과 2]
	 * 	 * 두개의 정수를 입력하세요
	 * 	 * 3 10
	 * 	 * 3과10의 공약수 :1
	 * 	 * 
	 * 	 * 
	 * [결과 3]
	 * 	 * 두개의 정수를 입력하세요
	 * 	 * 10 20
	 * 	 * 10과20의 공약수 :1,2,5,10
	 * 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		System.out.print("a = ");
		int a = scan.nextInt();
		System.out.print("b = ");
		int b = scan.nextInt();

		System.out.print(a+","+b+"의 공약수 =");
		
		for(int i=1; i<=a; i++) {
			if(a%i==0&&b%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
