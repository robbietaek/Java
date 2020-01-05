package chap5;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		int num = str.length();
		int sum = 0;
		for(int i=0;i<num;i++) {
//			sum += str.charAt(i);
//			sum -= '0';
			sum += Integer.parseInt(str.charAt(i)+"");
		}
		System.out.println(sum);
	}

}
