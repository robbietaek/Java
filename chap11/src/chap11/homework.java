package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 5. 1���� 100���� �� ������ ���ڸ� ��ǻ�Ͱ� �����ϰ�, ���� �Է¹޾� ����� ���� ���ߴ� ���α׷��� �ۼ��ϱ�
   �� 1 ���� 100������ ���ڰ� �ƴ� ��쿡�� 1 �� 100������ ���ڸ� �Է��ϼ��並 ����ϰ� 
   ���ڰ� �Է��� �ȵ� ���� ���ڸ� �Է��ϼ��� �� ����ϰ� ��� �Է��� �޴´�.
   ����� �Է¸��� ���ڸ� ���߾����� ����ϱ�.
   �� �Է� ������ �Էµ� �Է� �Ǽ��� ���Եȴ�.
 */

public class homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
		int count = 0;

		while (true) {
			System.out.println("���ڸ� 1���� 100���� �Է��ϼ���.");
			int input = 0;

			try {
				input = scan.nextInt();
				if (input > 100 || input < 1) {
					throw new Exception("1�� 100 ������ ���ڸ� �־��ּ���.");
				}

			} catch (InputMismatchException ye) {
				String str = scan.next();
				System.out.println(str + " �� ���ڰ� �ƴմϴ�.");
				count++;
			} catch (Exception yee) {
				System.out.println(yee.getMessage());
				count++;
			}
			

			if (ran > input) {
				System.out.println(input + "���� Ů�ϴ�.");
				count++;

			} else if (ran < input) {
				System.out.println(input + "���� �۽��ϴ�.");
				count++;

			} else {

				System.out.println("�����Դϴ�.");
				System.out.println("�� Ƚ�� : " + count);
				count++;
				break;
			}

		}

	}
}
