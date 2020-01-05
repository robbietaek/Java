package chap12;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);

		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt();

		System.out.println("월을 입력하세요.");
		int month = scan.nextInt();

		System.out.println("\t" + year + "년" + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

//		int day = 1;

//		c.set(year, month - 1, day);

		int yoil = c.get(Calendar.DAY_OF_WEEK);


//		for (int i = 0; i < 7; i++) {
//
//			for (int j = 0; j < 7; j++) {
//
//				if (day > c.getActualMaximum(Calendar.DATE)) {
//					break;
//				}
//				if (i == 0 && j < yoil) {
//					System.out.print(blank);
//				} else {
//					System.out.print(day + "\t");
//					day++;
//				}
//			}
//			System.out.println();
//		}

		
//		for(int i=1,day=1; day<=c.getActualMaximum(Calendar.DATE);i++) {
//			if(i<yoil) System.out.printf("%3s","");
//			else System.out.printf("%3d",day++);
//			if(i%7==0)System.out.println();
//		}
		
		
		
		
		
		
		
		
	}
}
