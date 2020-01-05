package chap19;

import java.util.*;
import java.io.*;

class Student2 implements Comparable<Student2> {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student2(String name, int eng, int math, String major) {
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
	
	public int getTotal() {
		return math+eng;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + ", total=" + getTotal() +"]";
	}

	@Override
	public int compareTo(Student2 o) {
		return name.compareTo(o.name);
	}

}

public class SortedEx2 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(new Student2("ȫ�浿", 90, 80, "�濵"), new Student2("���", 95, 85, "�İ�"),
				new Student2("�̸���", 80, 90, "ȭ��"), new Student2("�Ӳ���", 70, 60, "�İ�"));
		list.stream().sorted().forEach(System.out::println);
		System.out.println("���������� ���ϱ� (�������)");
		list.stream().sorted(new Comparator<Student2>() {
			public int compare(Student2 s1, Student2 s2) {
				return s2.getEng() - s1.getEng();
			}
		}).forEach(System.out::println);
		
		System.out.println("���������� ���ϱ� (���ٹ��)");
		list.stream().sorted((s1,s2)->s2.getEng()-s1.getEng()).forEach(System.out::println);
		
		System.out.println("�������� �������� �����Ͽ� ����ϱ� : ���ٹ��");
		list.stream().sorted((s1,s2)->s2.getMath()-s1.getMath()).forEach(System.out::println);
		
		System.out.println("���� �������� �����Ͽ� ����ϱ�");
		list.stream().sorted((s1,s2)->s2.getTotal()-s1.getTotal()).forEach(System.out::println);
		
	}
}
