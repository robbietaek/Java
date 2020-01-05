package chap14;

import java.util.*;

public class problem3 {
 	public static void main(String[] args) {
 		Set<Integer> set = new TreeSet<>();
 		
 	
 		set.add(10);
 		set.add(8);
 		set.add(6);
 		set.add(4);
 		set.add(2);
 		set.add(0);
 		set.add(10);
 		set.add(8);
 		set.add(6);
 		set.add(4);
 		set.add(2);
 		set.add(0);
 		System.out.println(set);
 		System.out.println("Lotto ¹øÈ£ ========");
 		Set<Integer> ball = new TreeSet<>();
 		while(ball.size() < 6) {
 			ball.add((int)(Math.random()*45)+1);
 		}
 		System.out.println(ball);
	}
}
