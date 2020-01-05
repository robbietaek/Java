package chap12;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1==s2) {
			System.out.println("s1==s2 : 같은 객체");
		}
		else{
			System.out.println("s1!=s2 : 다른 객체");
		}
		if(s1.equals(s2)){
			System.out.println("s1.eqaul(s2) : 같은내용");
		}
		else{
			System.out.println("!s1.eqaul(s2) : 다른내용");
		}
		if(s3==s4) {
			System.out.println("s3==s4 : 같은 객체");
		}
		else{
			System.out.println("s3!=s4 : 다른 객체");
		}
		if(s3.equals(s4)){
			System.out.println("s3.eqaul(s4) : 같은내용");
		}
		else{
			System.out.println("!s3.eqaul(s4) : 다른내용");
		}
		if(s2==s3) {
			System.out.println("s2==s3 : 같은 객체");
		}
		else{
			System.out.println("s2!=s3 : 다른 객체");
		}
		if(s2.equals(s3)){
			System.out.println("s2.eqaul(s3) : 같은내용");
		}
		else{
			System.out.println("!s2.eqaul(s3) : 다른내용");
		}

	}
}
