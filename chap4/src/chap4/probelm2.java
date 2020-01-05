package chap4;

import java.util.Scanner;

public class probelm2 {
public static void main(String[] args) {
	
	System.out.println("숫자를 입력하세요");
	Scanner scan = new Scanner (System.in);
	int score = scan.nextInt();
	System.out.println(score + "는" + ((score>0)?"양수":(score<0)?"음수":"0") + "입니다.");
	
}
}
