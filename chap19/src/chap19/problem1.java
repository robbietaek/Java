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
		List<Student> list = Arrays.asList(new Student("ȫ�浿",60,70,"�İ�"),new Student("���",65,55,"�濵"), new Student("�̸���",80,75,"ȭ��"), new Student("�Ӳ���",85,65,"�İ�"));
		list.stream().forEach(s->System.out.println(s + "��� :" + (s.getEng()+s.getMath())/2.0));
		
		int sum = list.stream().mapToInt(s->s.getMath()).sum();
		System.out.println("�������� ���� " + sum);
		System.out.println("�������� ��� " + list.stream().mapToInt(Student::getMath).average().getAsDouble());
		System.out.println("�İ��� �ο���" + list.stream().filter(s->s.getMajor().equals("�İ�")).count());
		list.stream().filter(s->s.getMajor().equals("�İ�")).forEach(s-> System.out.println(s));
		System.out.println("�İ��� �������� ���� " + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToDouble(s->s.getMath()).sum());
		System.out.println("�İ��� �������� ��� " + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToDouble(s->s.getMath()).average().getAsDouble());
	}
}
