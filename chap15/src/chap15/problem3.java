package chap15;
/*
 * ���ϸ��� �Է��ϼ���.
 */

import java.util.*;
import java.io.*;

public class problem3 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String name = scan.nextLine();
		FileWriter file = new FileWriter(name, true);

		System.out.println("������ ������ �Է��ϼ���. (���� : exit)");

		while (true) {
			String text = scan.nextLine();

			if (text.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			file.write(text + "\n");
		}
		file.flush();
	}
}
