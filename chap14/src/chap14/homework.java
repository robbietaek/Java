/*1. Student 클래스 구현하기
멤버변수:이름,국어점수,영어점수,수학점수
멤버메서드
String toString():각멤버변수값,총점,평균 출력
int getTotal():점수의 합 리턴
int compareTo():이름 오름차순으로 정렬되도록 구현
2. makeTreeSet 메서드 완성하기
*/
package chap14;

import java.util.*;

class Student1 implements Comparable<Student1> {

	String name;
	int kor;
	int eng;
	int math;

	public Student1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return (kor + eng + math);
	}

	@Override
	public String toString() {
		return "국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총합 : " + getTotal() + ", 평균 : " + getTotal() / 3;
	}

	public int compareTo(Student1 s) {
		return name.compareTo(s.name);
	}

}

public class homework {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1("홍길동", 90, 80, 70));
		list.add(new Student1("김삿갓", 95, 85, 75));
		list.add(new Student1("이몽룡", 80, 95, 95));
		list.add(new Student1("임꺽정", 60, 75, 100));

		System.out.println("기본정렬방식");
		TreeSet<Student1> set1 = makeTreeSet(list, null);
		System.out.println(set1);
		System.out.println("총점기준 내림차순 정렬");
		TreeSet<Student1> set2 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.getTotal() - o1.getTotal();
			}
		});
		System.out.println(set2);
		System.out.println("국어 점수내림차순 정렬");
		TreeSet<Student1> set3 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.kor - o1.kor;
			}
		});
		System.out.println(set3);
		System.out.println("영어 점수내림차순 정렬");
		TreeSet<Student1> set4 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.eng - o1.eng;
			}
		});
		System.out.println(set4);
		System.out.println("수학 점수내림차순 정렬");
		TreeSet<Student1> set5 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.math - o1.math;
			}
		});
		System.out.println(set5);
	}

	private static TreeSet<Student1> makeTreeSet(List<Student1> list, Comparator<Student1> c) {
		TreeSet<Student1> set = new TreeSet<Student1>(c);
		set.addAll(list);
		return set;
	}
}