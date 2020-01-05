package chap6;

import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {

		int numarr[] = {0,1,2,3,4,5,6,7,8,9};
		int answer[] = new int[4];
		
		for(int i=0; i<9999;i++) {
			int ran1 = (int)(Math.random()*10);
			int ran2 = (int)(Math.random()*10);
			int temp = numarr[ran1];
			numarr[ran1] = numarr[ran2];
			numarr[ran2] = temp;

		}
		
		for(int k=0;k<4;k++) {
			answer[k] = numarr[k];
		}
		
		Scanner scan = new Scanner(System.in);
		int[] data = new int[4];
		while(true) {
			
			System.out.println("서로 다른 4자리 숫자를 입력하세요");
			String input = scan.next();
			
			for(int i=0;i<4;i++) {
			data[i] = input.charAt(i)-'0';
			}
			
			for(int a : answer) {
				System.out.print(a);
			}
			
			System.out.println();
						
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<4; i++) {
				if(answer[i] == data[i] ) {
					strike += 1;
				}
				else {
				for(int j=0; j<4; j++) {
					if(answer[i]==data[j]) {
						ball += 1 ;
					}
				}
			}
		}
		
						
			
			if(strike==4) {
			System.out.println("정답입니다. 게임을 종료합니다.");
			break;
			}
			
			else {
				System.out.println(strike + "스트라익, " + ball+ " 볼");
			}
		}
	}

}
