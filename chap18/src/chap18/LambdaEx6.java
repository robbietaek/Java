package chap18;

import java.util.function.*;

public class LambdaEx6 {
	public static void main(String[] args) {
		Consumer<String> c1 = t-> System.out.println(t+8);
		c1.accept("java");
		BiConsumer<String,String> c2 = (t,u) -> System.out.println(t+u);
		c2.accept("java", "8.0 이후");
		DoubleConsumer c3 = d->System.out.println("java"+d);
		c3.accept(8.0);
		ObjIntConsumer<String> c4 = (t,i) -> System.out.println(t+i);
		c4.accept("java", 8);
		IntConsumer c5 = x -> {	int sum=0; for(int i=1;i<=x;i++) {sum += i;} System.out.println(sum);};
		c5.accept(10); //1부터 10까지 합을 출력하세요
	}
}
