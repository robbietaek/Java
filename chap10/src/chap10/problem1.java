package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) throws Exception {

		while (true) {

			System.out.println("1~10���� ���ڸ� �Է��ϼ���. (���� :99)");
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
				System.out.println("���ڸ� �Է��ϼ���.");
			} catch (Exception e) {
				System.out.println("���ڰ� ������ �ʰ��Ͽ����ϴ�.");
			}

		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
