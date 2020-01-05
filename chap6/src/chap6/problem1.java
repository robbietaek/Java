package chap6;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		System.out.println("정수를 5개 입력하세요");
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0; i<score.length;i++) {
			score[i] = scan.nextInt();
			sum += score[i];
		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		
		int max = 0;
		
		for(int i=0; i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];				
			}
		}
		System.out.println("최대값 : "+max);
		
		int min = 0;
		
		for(int i=0; i<score.length;i++) {
			if(i==0||min>score[i]) {
				min = score[i];				
			}
		}
		System.out.println("최소값 : "+min);

	}

}
