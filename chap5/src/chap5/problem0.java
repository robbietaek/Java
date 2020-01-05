package chap5;

import java.util.Scanner;

public class problem0 {
public static void main(String[] args) {
	
	System.out.println("숫자를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	double num = scan.nextDouble();
	
	if(num>0) {
		System.out.println("양수입니다.");
	}
	
	else if(num<0) {
		System.out.println("음수입니다.");
	}
	
	else{
		System.out.println("0입니다.");
	}
}
}
