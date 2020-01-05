package chap19;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	}

}

public class problem1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동",60,70,"컴공"),new Student("김삿갓",65,55,"경영"), new Student("이몽룡",80,75,"화공"), new Student("임꺽정",85,65,"컴공"));
		list.stream().forEach(s->System.out.println(s + "평균 :" + (s.getEng()+s.getMath())/2.0));
		
		int sum = list.stream().mapToInt(s->s.getMath()).sum();
		System.out.println("수학점수 총점 " + sum);
		System.out.println("수학점수 평균 " + list.stream().mapToInt(Student::getMath).average().getAsDouble());
		System.out.println("컴공과 인원수" + list.stream().filter(s->s.getMajor().equals("컴공")).count());
		list.stream().filter(s->s.getMajor().equals("컴공")).forEach(s-> System.out.println(s));
		System.out.println("컴공과 수학점수 총점 " + list.stream().filter(s->s.getMajor().equals("컴공")).mapToDouble(s->s.getMath()).sum());
		System.out.println("컴공과 수학점수 평균 " + list.stream().filter(s->s.getMajor().equals("컴공")).mapToDouble(s->s.getMath()).average().getAsDouble());
	}
}
