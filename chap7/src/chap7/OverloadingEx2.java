package chap7;
class Math4{
	int add(int a,int b){
		System.out.print("int int �޼�Ʈ ���");
		return a+b;
	}

	long add(long a,int b){
		System.out.print("long int �޼�Ʈ ���");
		return a+b;
	}
	
	long add(int a,long b){
		System.out.print("int long �޼�Ʈ ���");
		return a+b;
	}
	
	long add(long a,long b){
		System.out.print("long long �޼�Ʈ ���");
		return a+b;
	}
		
}


public class OverloadingEx2 {

	public static void main(String[] args) {

		Math4 m4 = new Math4();
		System.out.println(m4.add(1000000000, 10));
		System.out.println(m4.add(10, 10000000000L));
		System.out.println(m4.add(1000000000000L, 10));
		System.out.println(m4.add(1000000000000000000L, 1000000000000000000L));

	}

}
