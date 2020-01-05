package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 5. 1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
   단 1 부터 100까지의 숫자가 아닌 경우에는 1 과 100사이의 숫자만 입력하세요를 출력하고 
   숫자가 입력이 안된 경우는 숫자만 입력하세요 를 출력하고 계속 입력을 받는다.
   몇번의 입력만에 숫자를 맞추었는지 출력하기.
   단 입력 오류된 입력도 입력 건수에 포함된다.
 */

public class homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
		int count = 0;

		while (true) {
			System.out.println("숫자를 1부터 100까지 입력하세요.");
			int input = 0;

			try {
				input = scan.nextInt();
				if (input > 100 || input < 1) {
					throw new Exception("1과 100 사이의 숫자를 넣어주세요.");
				}

			} catch (InputMismatchException ye) {
				String str = scan.next();
				System.out.println(str + " 는 숫자가 아닙니다.");
				count++;
			} catch (Exception yee) {
				System.out.println(yee.getMessage());
				count++;
			}
			

			if (ran > input) {
				System.out.println(input + "보다 큽니다.");
				count++;

			} else if (ran < input) {
				System.out.println(input + "보다 작습니다.");
				count++;

			} else {

				System.out.println("정답입니다.");
				System.out.println("총 횟수 : " + count);
				count++;
				break;
			}

		}

	}
}
