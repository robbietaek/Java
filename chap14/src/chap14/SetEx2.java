package chap14;

import java.util.*;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "(" + name + "," + age+ ")";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		} else return false;
	}
	
}




public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("È«±æµ¿",10));
		set.add(new Person("È«±æµ¿",10));
		System.out.println(set);
		Person p1 = new Person("±è»ñ°«",20);
		Person p2 = p1;
		set.add(p1);
		set.add(p2);
		System.out.println(set);
	}
}
