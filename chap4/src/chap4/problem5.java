package chap4;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String my;
		
		if(score>=90) {
			my = "A";
		}
		
		else if(score>=80){
			my = "B";
		}
	
		else if(score>=70) {
		my = "C";
		}

		else if(score>=60) {
			my = "D";
		}
		
		else {
			my = "F";
					
		}
		System.out.println("������"+my+"�Դϴ�.");
	}
	}
