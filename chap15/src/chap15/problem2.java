package chap15;

import java.util.*;
import java.io.*;

public class problem2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		String name = scan.nextLine();
		FileWriter file = new FileWriter(name, true);

		System.out.println("������ �Է��ϼ���.");

		while (true) {
			String text = scan.nextLine();
			if (text.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}

			file.write(text);
		}

		file.flush();

	}

}
