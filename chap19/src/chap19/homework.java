package chap19;

import java.util.Scanner;
import java.util.stream.IntStream;

public class homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = IntStream.rangeClosed(a, b).sum();
		System.out.println("�հ� : " + sum);
		int even_sum = IntStream.rangeClosed(a, b).filter(s -> s % 2 == 0).sum();
		System.out.println("�հ� : " + even_sum);
		int odd_sum = IntStream.rangeClosed(a, b).filter(s -> s % 2 != 0).sum();
		System.out.println("�հ� : " + odd_sum);

	}

}
