package finalt;

interface i {
	static void method() {};
}



class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "�̸�:" + name + ", ���� :"+ age ;
	}
	
}

public class newfile {
	public static void main(String[] args) {
		Animal a = new Animal("������", 20);
		System.out.println(a);
	}
}