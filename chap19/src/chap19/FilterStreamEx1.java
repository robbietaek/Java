package chap19;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���","ȫ�浿","�Ӳ���","ȫ�浿");
		list.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		list.stream().filter(n->n.startsWith("ȫ")).forEach(n->System.out.println(n));;
		System.out.println();
		list.stream().distinct().filter(n->n.startsWith("ȫ")).forEach(n->System.out.println(n));;
		System.out.println();
		
	}
}
