package chap6;

import java.util.Scanner;

public class problem5 {
public static void main(String[] args) {
	
	System.out.println("숫자를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int[] sum = new int[32];
	
	int div = num;
	int t = 0;
	
	while(div!=0) {
		sum[t] = div%8;
		div /=8;
		t++;
	}
	
	for(int i=t-1;i>=0;i--) {
		System.out.print(sum[i]);
	}
	
	
	
	}
}
