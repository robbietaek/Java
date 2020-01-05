package chap18;

import java.util.function.*;

public class LambdaEx7 {
	public static void main(String[] args) {
//		Supplier<String> s1 = () -> {
//			return "java";
//		};
		Supplier s1 = () -> "java";
		System.out.println(s1.get());

//		IntSupplier s2 = () -> {
//			int num = (int)(Math.random()*6)+1;
//			return num;
//		};
		IntSupplier s2 = () -> ((int) (Math.random() * 6) + 1);
		System.out.println(s2.getAsInt());

		DoubleSupplier s3 = () -> {
			double d = Math.random();
			return d;
		};
		
		
//		DoubleSupplier s3 = () -> Math.random();
		System.out.println("임의의 실수" + s3.getAsDouble());
		
	}

}
