package chap5;

import java.util.Scanner;

public class problem2 {
public static void main(String[] args) {
	
	for(int i=0;i<100;i++) {
		
	System.out.println("연도를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	if(num%4==0) {
		if(num%400==0) {
			System.out.println("윤년입니다.");
		}
		else if(num%100==0) {
			System.out.println("평년입니다.");
		}
		else if(num%100!=0)
			System.out.println("윤년입니다.");
		}
	
	else if(num%4!=0) {
		System.out.println("평년입니다");
	}
	}
}
}
