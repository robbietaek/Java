package chap8;

class Parent{
	int x = 10;
	Parent(int x){
		this.x = x;
	}

//	Parent(){
//		System.out.println();
//	}
}

class Child2 extends Parent{
	int x = 20;
	void method() {
		
		int x= 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	Child2(){
		super(100);
	}
}



public class SuperEx1 {

	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.method();

	}

}
