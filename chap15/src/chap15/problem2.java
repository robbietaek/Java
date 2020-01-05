package chap15;

import java.util.*;
import java.io.*;

public class problem2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("제목을 입력하세요.");
		String name = scan.nextLine();
		FileWriter file = new FileWriter(name, true);

		System.out.println("내용을 입력하세요.");

		while (true) {
			String text = scan.nextLine();
			if (text.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			file.write(text);
		}

		file.flush();

	}

}
