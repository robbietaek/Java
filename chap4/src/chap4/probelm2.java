package chap4;

import java.util.Scanner;

public class probelm2 {
public static void main(String[] args) {
	
	System.out.println("���ڸ� �Է��ϼ���");
	Scanner scan = new Scanner (System.in);
	int score = scan.nextInt();
	System.out.println(score + "��" + ((score>0)?"���":(score<0)?"����":"0") + "�Դϴ�.");
	
}
}
