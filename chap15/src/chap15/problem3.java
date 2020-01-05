package chap15;
/*
 * 파일명을 입력하세요.
 */

import java.util.*;
import java.io.*;

public class problem3 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String name = scan.nextLine();
		FileWriter file = new FileWriter(name, true);

		System.out.println("저장할 내용을 입력하세요. (종료 : exit)");

		while (true) {
			String text = scan.nextLine();

			if (text.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			file.write(text + "\n");
		}
		file.flush();
	}
}
