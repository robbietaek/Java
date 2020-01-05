package chap6;

import java.util.Arrays;

public class probelm15 {

	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		};
		
		int[][] result=new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
			result[i][j] = score[i][j];
			
			result[i][score[i].length] += score[i][j];
			result[score.length][j] += score[i][j];
			result[score.length][score[i].length] += score[i][j];
			}
		}
		
		
			
		for(int i=0; i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println();
		}
		


	}

}
