package chap14;

import java.util.*;

class Student{
	String studno;
	String name;
	String major;
	
	Student(String studno, String name, String major){
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	public String toString() {
		return "("+studno + "," + name +")";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+studno.hashCode();
	} 

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && studno.equals(s.studno);
		} else return false;
		
	}

	
	
}




public class problem2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공"));
		set.add(new Student("1234","홍길동","통계"));
		set.add(new Student("4567","홍길동","경영"));
		
		System.out.println(set);
		System.out.println("등록학생수 : "+set.size());
	}
}
