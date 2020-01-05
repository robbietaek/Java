package chap7;


class animal{
	int age;
	String name;
	public String toString(){
		return "ÀÌ¸§(name) : "+name+"\n"+"³ªÀÌ(age) : "+age+"\n"+"¸ÀÀÖ°Ô ¾ä¾ä";
	}
}


public class homework2 {

	public static void main(String[] args) {

		animal ani = new animal();
		ani.age = 20;
		ani.name = "¿ø¼şÀÌ"; 
		System.out.println(ani);

	}

}
