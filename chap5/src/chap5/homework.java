package chap5;
/*
3. ������, ���Ƹ��� �հ� �ٸ����� ���� �Է¹޾Ƽ� 

   �������� �������� ���Ƹ��� �������� ����ϱ�.

   ����� �ȵ� ��� ������� ����ϱ�.
 */

import java.util.Scanner;

public class homework {

	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("�������� ���Ƹ��� ���� �Է��ϼ���.");
		 int animal = scan.nextInt();
		 
		 System.out.println("�ٸ����� �� �Է��ϼ���.");
		 int legs = scan.nextInt();
		 boolean a = false;
		 
		 for(int i=0; i<=animal;i++){
			 for(int j=0; j<=animal;j++) {
				 if((4*i+2*j)==legs && (i+j)==animal) {
					 System.out.print("������ ������"+i+"\t");
					 System.out.println("���Ƹ� ������"+j);	
					 a = true;
			}
		
		 }
	   }
		 if(a==false) {
			System.out.println("�������");
		}
	 }
 }
		 




