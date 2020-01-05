package chap5;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {

		System.out.println("문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		
		if(ch>='a' && ch<='b') {
			System.out.println("소문자입니다.");
			
		}

		else if(ch>='A' && ch<='Z') {
			System.out.println("대문자입니다.");
		}
		
		else if(ch>='0' && ch<='9')
			System.out.println("숫자입니다.");
		
		else {
			System.out.println("기타문자입니다.");
		}
	}

}
