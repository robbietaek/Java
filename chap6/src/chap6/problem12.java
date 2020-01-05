package chap6;

import java.util.Scanner;

public class problem12 {

	public static void main(String[] args) {
		

		System.out.println("홀수의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int star[][] = new int[num][num];
		int sum = 0;
		
		for(int i=num;i>0;i-=2) {
			sum += i;
		}
		sum = sum*2-1;
		
		for(int i=0; i<=num/2;i++) {
			for(int j=i;j<num-i;j++) {
				star[i][j] = sum--;
			}
		}
		
		
		
		for(int i=num/2+1;i<num;i++) {
			for(int j=num-i-1;j<=i;j++) {
				star[i][j] = sum--;
			}
		}
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				
				if(star[i][j] ==0)
//					System.out.print("\t");
					System.out.printf("%4c",' ');
					
				else
//					System.out.print(star[i][j]+"\t");
				System.out.printf("%4d",star[i][j]);
				
			}
			System.out.println();
		}
		
		

	}
}