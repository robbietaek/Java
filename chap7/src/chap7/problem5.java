package chap7;

class Animal2{
	
	String name;
	int age;
	
	Animal2(String a,int b){
		name = a;
		age = b;
	}
	
	
	public String toString() {
		return name+":"+age;
	}
	
}


public class problem5 {

	public static void main(String[] args) {
		Animal2 a= new Animal2("¿ø¼þÀÌ",26);
		System.out.println(a);

	}

}
