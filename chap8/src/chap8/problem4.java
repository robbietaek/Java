package chap8;

abstract class Animal{
	String type;
	int legs;
	
	Animal(String type, int legs){
		this.type = type;
		this.legs = legs;		
	}
	
	abstract void eat();
	abstract void sound();
}


class Dog extends Animal{
	
	Dog(){
		super("��",4);
	}

	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}

	@Override
	void sound() {
		System.out.println("�۸�");
	}

	@Override
	public String toString() {
		return "Dog [type=" + type + ", legs=" + legs + "]";
	}
	
}


class Lion extends Animal{
	Lion(){
		super("����",4);
	}

	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��ƸԴ´�");
	}

	@Override
	void sound() {
		System.out.println("����");
	}

	@Override
	public String toString() {
		return "Lion [type=" + type + ", legs=" + legs + "]";
	}
	
}






public class problem4 {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Lion();
		
		for(Animal a : animal) {
			System.out.print(a.type + "=>");
			a.sound();
			a.eat();
			}
	}
}
