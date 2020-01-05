package chap6;

import java.util.Scanner;

public class problem10 {
		public static void main(String[] args) {
	
			int[][] study= {{50,60,70}, {80,60,40},{10,20,30,},{25,35,45},{60,70,80}};
			int[] total = new int[study.length];
			for(int i=0; i<study.length;i++) {
				
				System.out.print(i+"번 학생 =");
				int sum = 0;

				for(int j=0; j<study[i].length;j++) {
					sum += study[i][j];
					total[j] += study[i][j];
					System.out.print(+study[i][j]+",");
					}
				
				System.out.print(sum+",");
				System.out.print((double)sum/study[i].length);
				
				System.out.println();

				}
			
			
			
			System.out.print("과목총점 = ");
			for(int i=0;i<study[1].length;i++) {
				System.out.print((double)total[i]+" ");
			}
			System.out.println();
			System.out.print("과목평균 = ");
			for(int i=0;i<study[1].length;i++) {
				System.out.print((double)total[i]/study.length+" ");
			}
			}

			
	}

