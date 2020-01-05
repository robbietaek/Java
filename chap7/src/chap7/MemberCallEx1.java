package chap7;

public class MemberCallEx1 {


		static int cv1 = 10;
		static int cv2 = cv1;
		int iv1 = 100;
		int iv2 = iv1;
		static int cv3 = new MemberCallEx1().iv1;
		
		public static void main(String[] args) {
			cv2= new MemberCallEx1().iv1;
			

	}
		
		void method1() {
			System.out.println(cv1+cv2);
			System.out.println(iv1+iv2);
		}
		static void method2() {
			System.out.println(cv1+cv2);
			MemberCallEx1 m = new MemberCallEx1();
			System.out.println(m.iv1 + m.iv2);
		}

}
