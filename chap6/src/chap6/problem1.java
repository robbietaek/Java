package chap6;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		System.out.println("������ 5�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0; i<score.length;i++) {
			score[i] = scan.nextInt();
			sum += score[i];
		}

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double)sum/score.length);
		
		int max = 0;
		
		for(int i=0; i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];				
			}
		}
		System.out.println("�ִ밪 : "+max);
		
		int min = 0;
		
		for(int i=0; i<score.length;i++) {
			if(i==0||min>score[i]) {
				min = score[i];				
			}
		}
		System.out.println("�ּҰ� : "+min);

	}

}
