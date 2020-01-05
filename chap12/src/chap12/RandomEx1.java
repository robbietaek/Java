package chap12;

import java.util.*;

public class RandomEx1 {

	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0);
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		System.out.println("rand==>");
		for(int i = 0; i<5 ; i++) {
			System.out.println(i+":"+rand.nextInt(1000));
		}
			System.out.println();
			System.out.println("rand2==>");
			for(int i = 0; i<5; i++) {
				System.out.println(i+":"+rand2.nextInt(1000));
			}
		

	}
}
