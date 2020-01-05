package chap6;

public class ArrayEx12 {

	public static void main(String[] args) {

		int score1[] = {90,80,70};
		int score2[] = new int[5];
		
		for(int i =0; i<score1.length;i++) {
			score2[i] = score1[i];
		}

		for(int a : score2) {
			System.out.println(a);
		}
	}

}
