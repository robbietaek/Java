package chap19;

	import java.util.*;
	import java.util.stream.Stream;
	
public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���","������","�Ӳ���","�����");
		System.out.println("�ܺ� �ݺ��� �̿�");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------"
				+ "");
		System.out.println("���ιݺ��� �̿�");
//		list.stream().forEach(s->System.out.println(s));
		Stream<String> st = list.stream();
		st.forEach(s->System.out.println(s));
//		System.out.println("�ٽ� ���");
//		st.forEach(s->System.out.println(s));
	}
}
