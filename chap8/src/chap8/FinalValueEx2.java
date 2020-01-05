package chap8;

class FinalValue{
	final int NUM;
	FinalValue(){
		this(100);
	}
	FinalValue(int num){
		this.NUM = num;
	}
	
	public int getNUM() {
		return NUM;
	}
}


public class FinalValueEx2 {

	public static void main(String[] args) {

		FinalValue f1 = new FinalValue();
		System.out.println(f1.getNUM());
		FinalValue f2 = new FinalValue(120);
		System.out.println(f2.getNUM());

	}

}
