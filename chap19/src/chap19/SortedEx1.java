package chap19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���","�Ӳ���");
		list.stream().forEach(s->System.out.println(s));
		System.out.println("�⺻����");
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("�⺻ ���� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
