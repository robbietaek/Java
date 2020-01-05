package chap5;

import java.util.Scanner;

public class LoopEx5 {
/*
 * 숫자맞추기 게임
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고 있고,
 * 사용자는 반복적으로 숫자를 입력해서 저장된 숫자를 맞추기.
 * 숫자를 맞추면 프로그램 종료하기
 */
	public static void main(String[] args) {

		int ans = (int)(Math.random()*100) + 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int i = 0;
		do {
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if(ans> input) {
				System.out.print("더  큰 수 입니다. ");
				i++;
				System.out.println(i+"번 시도하셨습니다.");
			}
			else if(ans<input) {
				System.out.print("더 작은 수 입니다. ");
				i++;
				System.out.println(i+"번 시도하셨습니다.");
			}
			else {
				i++;
				System.out.println(i+"번만에 정답입니다.");
			}
		
		}while(ans!=input);

	}

}
