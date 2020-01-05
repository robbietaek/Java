package chap5;
/*
3. 강아지, 병아리의 합과 다리수의 합을 입력받아서 

   강아지의 마리수와 병아리의 마리수를 출력하기.

   계산이 안될 경우 정답없음 출력하기.
 */

import java.util.Scanner;

public class homework {

	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("강아지와 병아리의 합을 입력하세요.");
		 int animal = scan.nextInt();
		 
		 System.out.println("다릿수의 합 입력하세요.");
		 int legs = scan.nextInt();
		 boolean a = false;
		 
		 for(int i=0; i<=animal;i++){
			 for(int j=0; j<=animal;j++) {
				 if((4*i+2*j)==legs && (i+j)==animal) {
					 System.out.print("강아지 마릿수"+i+"\t");
					 System.out.println("병아리 마릿수"+j);	
					 a = true;
			}
		
		 }
	   }
		 if(a==false) {
			System.out.println("정답없음");
		}
	 }
 }
		 




