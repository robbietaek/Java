package chap4;

import java.util.Scanner;

public class problem4 {
public static void main(String[] args) {
	
	System.out.println("����� ������ �Է��ϼ���");
	Scanner scan = new Scanner(System.in);
	int apple = scan.nextInt();
	
	int num;
	
	
	if(apple%10==0) {
		num = apple/10;
	}
	else {
		num = (apple/10)+1;
	}
	System.out.println(num+"����");
	}

}
