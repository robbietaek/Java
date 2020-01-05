package chap4;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		
		System.out.println("10부터 99까지의 수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		int mul = ((num>=10 && num<=99)?((num%10==0)?(num-num):((num%10+1)*10-num)):0);
		
		System.out.println("숫자는 : "+mul + "입니다");
		

	}

}
