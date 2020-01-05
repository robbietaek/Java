package chap6;

import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] h = new char[32];
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		while(divnum!=0) {
			h[index++] = data[divnum%16];
			divnum /=16;
		}
		
		for(int i=index-1;i>=0;i--) {
			System.out.print(h[i]);
		}
		
		
		
		}
	}