package chap14;

import java.util.*;

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"ȫ�浿",1,'1',"1","���","�̸���","ȫ�浿","������","�����","ȫ�浿","���"};
		Set<Object> set1 = new HashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i= 0; i< arr.length;i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
