package chap12;

import java.util.Calendar;
import java.util.Scanner;

public class problem7 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scan.nextInt();

		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();

		System.out.println("\t" + year + "��" + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int day = 1;

		c.set(year, month - 1, day);

		int yoil = c.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7; j++) {

				if (day > c.getActualMaximum(Calendar.DATE)) {
					break;
				}
				if (i == 0 && j < yoil) {
					System.out.print("\t");
				} else {
					System.out.print(day + "\t");
					day++;
				}
			}
			System.out.println();
		}
	}
}
