import java.util.Scanner;

public class problem1 {
	/*
	 * 1. �ΰ��� ���� �Է� �޾� �μ��� ������� ���ϱ�
	 * * [��� 1]
	 * 	 * �ΰ��� ������ �Է��ϼ���
	 * 	 * 10 25
	 * 	 * 10��25�� ����� :1,5
	 *  * 
	 * 	 * 
	 * [��� 2]
	 * 	 * �ΰ��� ������ �Է��ϼ���
	 * 	 * 3 10
	 * 	 * 3��10�� ����� :1
	 * 	 * 
	 * 	 * 
	 * [��� 3]
	 * 	 * �ΰ��� ������ �Է��ϼ���
	 * 	 * 10 20
	 * 	 * 10��20�� ����� :1,2,5,10
	 * 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��ϼ���.");
		System.out.print("a = ");
		int a = scan.nextInt();
		System.out.print("b = ");
		int b = scan.nextInt();

		System.out.print(a+","+b+"�� ����� =");
		
		for(int i=1; i<=a; i++) {
			if(a%i==0&&b%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
