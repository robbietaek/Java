package chap14;

import java.util.*;

public class ListEx2 {
	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
		list.add(5.0);
		for(Double o : list) {
			System.out.print(o+", ");
		}
		System.out.println();
		
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >= 0) System.out.println(num + "의 위치 :" + index);
		else System.out.println(num + "은 list에 없습니다.");
		num = 0.3;
		if(list.contains(num)) {
			list.remove(num);
			System.out.println(num + "은 삭제됨");
		}
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		System.out.println(list);
	}
}
