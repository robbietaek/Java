package chap8;

class Super{
	int x ;
	Super(int x){
		this.x =x;
	}

}

class Child extends Super{
	int y;
	public Child() {
		super(10);
	}
}

public class SuperEx {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);

	}

}
