package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("�Է��� Ȧ�� ���ڸ� �Է��ϼ���");
		int num = 0;

		while (true) {

			try {
				num = scan.nextInt();
				if (num % 2 == 0) {
					throw new Exception();
				}
			} catch (Exception error) {
				System.out.println("���� : Ȧ���� �Է��ϼ��� �ٽ� �Է��ϼ���.");
				continue;
			}

			for (int i = 0; i < num; i++) {
				System.out.println(i + "��° �Է��Դϴ�.");
				list.add(scan.nextInt());
				sum += list.get(i);
			}

			Collections.sort(list);

			System.out.println("��ü ����Ʈ�� " + list + "�Դϴ�.");
			System.out.println("����� : " + sum / num + "�Դϴ�.");
			System.out.println("�߰� ���� : " + list.get(num / 2) + "�Դϴ�");
			break;
		}
	}

}
