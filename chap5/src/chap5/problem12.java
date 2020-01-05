package chap5;

import java.util.Scanner;

public class problem12 {

	public static void main(String[] args) {

		System.out.println("높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		
		for(int i=0;i<height;i++) {
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			
			for(int j = height; j>i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
