package chap12;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1==s2) {
			System.out.println("s1==s2 : ���� ��ü");
		}
		else{
			System.out.println("s1!=s2 : �ٸ� ��ü");
		}
		if(s1.equals(s2)){
			System.out.println("s1.eqaul(s2) : ��������");
		}
		else{
			System.out.println("!s1.eqaul(s2) : �ٸ�����");
		}
		if(s3==s4) {
			System.out.println("s3==s4 : ���� ��ü");
		}
		else{
			System.out.println("s3!=s4 : �ٸ� ��ü");
		}
		if(s3.equals(s4)){
			System.out.println("s3.eqaul(s4) : ��������");
		}
		else{
			System.out.println("!s3.eqaul(s4) : �ٸ�����");
		}
		if(s2==s3) {
			System.out.println("s2==s3 : ���� ��ü");
		}
		else{
			System.out.println("s2!=s3 : �ٸ� ��ü");
		}
		if(s2.equals(s3)){
			System.out.println("s2.eqaul(s3) : ��������");
		}
		else{
			System.out.println("!s2.eqaul(s3) : �ٸ�����");
		}

	}
}
