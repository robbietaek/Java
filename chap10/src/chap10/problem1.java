package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) throws Exception {

		while (true) {

			System.out.println("1~10까지 숫자를 입력하세요. (종료 :99)");
			Scanner scan = new Scanner(System.in);
			try {

				int no = scan.nextInt();

				if (no == 99) {
					break;
				} else if (no < 1 || no > 10) {
					throw new Exception();
				}

				else {
					System.out.print(no + ":");
					for (int i = 0; i < no; i++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			} catch (Exception e) {
				System.out.println("숫자가 범위를 초과하였습니다.");
			}

		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
