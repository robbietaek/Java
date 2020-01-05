package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿Àü","Ãá¾çÀü","±¸¿î¸ù","Àü¿ìÄ¡Àü","»ç¾¾³²Á¤±â");
		System.out.println();
		list.stream().mapToInt(String::length).forEach(len->System.out.println(len));
		System.out.println();
		
		IntStream isr = list.stream().mapToInt(String::length);
		isr.forEach(System.out::println);
		System.out.println();
		
		list.stream().mapToInt(s->s.length()).forEach(System.out::println);
	}
}
