package chap12;

public class StringEx3 {
	public static void main(String[] args) {

		String s = "HTML-CSS-JavaScript-Java-������";
		String[] subject = s.split("-");
		for(int i=0;i<subject.length;i++) {
			System.out.println((i+1) + ":" + subject[i]);
		}
		s= "ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] names = s.split(",");
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("��ü�̸�" + names.length + "��");
		
		
		int i = Integer.parseInt("100");
		System.out.println(i);
		double d = Double.parseDouble("100.5");
		d++;
		
		String sf = String.format("%.2f", d+0.12345);
		System.out.println(sf);
		sf = String.format("%10d",i);
		System.out.println(sf);
	}
}
