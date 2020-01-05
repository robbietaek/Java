package chap14;

import java.util.*;

public class IteratorEx1 {
	public static void main(String[] args) {

		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList();
		Set<Integer> set = new HashSet();
		for(int i = 1 ; i <=5; i++) {
			list.add(i*10);
			set.add(i*10);
		}
		System.out.println(list);
		System.out.println(set);
		
		for(Integer o : list) {
			System.out.print(o+",");
		}
		System.out.println();
		
		for(Integer o : set) {
			System.out.print(o+",");
		}
		
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
	}

	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
