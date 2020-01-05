package chap5;

import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {

		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		String star = "*" ;
		
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		
	}

}
