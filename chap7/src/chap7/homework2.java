package chap7;


class animal{
	int age;
	String name;
	public String toString(){
		return "�̸�(name) : "+name+"\n"+"����(age) : "+age+"\n"+"���ְ� ���";
	}
}


public class homework2 {

	public static void main(String[] args) {

		animal ani = new animal();
		ani.age = 20;
		ani.name = "������"; 
		System.out.println(ani);

	}

}
