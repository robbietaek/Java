package chap4;

import java.util.Scanner;

public class OpEx10 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner (System.in);
		double score = scan.nextDouble();
		String result = (score>=60)?"합격":"불합격";
		System.out.println(score+"점은"+result+"입니다.");
		System.out.println(score + "은"+ ((score%2==0)?"짝수":"홀수"));
		//짝수, 홀수, 0인지 출력하기
		result = (score%2==1)?"홀수":(score%2>=0)?"짝수":"0";
		System.out.println(score + "점은" + result + "입니다.");
	}

}
