package chap8;

class SingleObject{
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}


public class SingletonEx {

	public static void main(String[] args) {
//		SingleObject so = new SingleObject(); //생성자 접근불가. 객체생성불가
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1.getValue());
		System.out.println(so1.getValue());
		so1.setValue(500);
		System.out.println(so1.getValue());
		System.out.println(so1.getValue());
		if(so1==so2)
			System.out.println("s01참조변수의 객체와 s02 참조변수의 객체는 같은 객체임");

	}

}
