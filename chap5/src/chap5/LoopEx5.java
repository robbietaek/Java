package chap5;

import java.util.Scanner;

public class LoopEx5 {
/*
 * ���ڸ��߱� ����
 * ��ǻ�Ͱ� 1���� 100������ ������ ���� �����ϰ� �ְ�,
 * ����ڴ� �ݺ������� ���ڸ� �Է��ؼ� ����� ���ڸ� ���߱�.
 * ���ڸ� ���߸� ���α׷� �����ϱ�
 */
	public static void main(String[] args) {

		int ans = (int)(Math.random()*100) + 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int i = 0;
		do {
			System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			if(ans> input) {
				System.out.print("��  ū �� �Դϴ�. ");
				i++;
				System.out.println(i+"�� �õ��ϼ̽��ϴ�.");
			}
			else if(ans<input) {
				System.out.print("�� ���� �� �Դϴ�. ");
				i++;
				System.out.println(i+"�� �õ��ϼ̽��ϴ�.");
			}
			else {
				i++;
				System.out.println(i+"������ �����Դϴ�.");
			}
		
		}while(ans!=input);

	}

}
