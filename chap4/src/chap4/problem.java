package chap4;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("세자리 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		System.out.println(num/100*100);
		
	}

}
