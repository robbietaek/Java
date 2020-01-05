package chap5;

import java.util.Scanner;

public class problem11 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String blank = " ";
		String star = "*";
		
		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(blank);
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(star);
			}
			
			System.out.println();
			
			
		}

	}

}
