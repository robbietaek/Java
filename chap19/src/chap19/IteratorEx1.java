package chap19;

	import java.util.*;
	import java.util.stream.Stream;
	
public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","¼ºÃáÇâ","ÀÓ²©Á¤","Çâ´ÜÀÌ");
		System.out.println("¿ÜºÎ ¹Ýº¹ÀÚ ÀÌ¿ë");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------"
				+ "");
		System.out.println("³»ºÎ¹Ýº¹ÀÚ ÀÌ¿ë");
//		list.stream().forEach(s->System.out.println(s));
		Stream<String> st = list.stream();
		st.forEach(s->System.out.println(s));
//		System.out.println("´Ù½Ã Ãâ·Â");
//		st.forEach(s->System.out.println(s));
	}
}
