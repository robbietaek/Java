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
		System.out.println("입력할 홀수 숫자를 입력하세요");
		int num = 0;

		while (true) {

			try {
				num = scan.nextInt();
				if (num % 2 == 0) {
					throw new Exception();
				}
			} catch (Exception error) {
				System.out.println("에러 : 홀수만 입력하세요 다시 입력하세요.");
				continue;
			}

			for (int i = 0; i < num; i++) {
				System.out.println(i + "번째 입력입니다.");
				list.add(scan.nextInt());
				sum += list.get(i);
			}

			Collections.sort(list);

			System.out.println("전체 리스트는 " + list + "입니다.");
			System.out.println("평균은 : " + sum / num + "입니다.");
			System.out.println("중간 값은 : " + list.get(num / 2) + "입니다");
			break;
		}
	}

}
