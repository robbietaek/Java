/*1. Student Ŭ���� �����ϱ�
�������:�̸�,��������,��������,��������
����޼���
String toString():�����������,����,��� ���
int getTotal():������ �� ����
int compareTo():�̸� ������������ ���ĵǵ��� ����
2. makeTreeSet �޼��� �ϼ��ϱ�
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
		return "���� : " + kor + ", ���� : " + eng + ", ���� : " + math + ", ���� : " + getTotal() + ", ��� : " + getTotal() / 3;
	}

	public int compareTo(Student1 s) {
		return name.compareTo(s.name);
	}

}

public class homework {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1("ȫ�浿", 90, 80, 70));
		list.add(new Student1("���", 95, 85, 75));
		list.add(new Student1("�̸���", 80, 95, 95));
		list.add(new Student1("�Ӳ���", 60, 75, 100));

		System.out.println("�⺻���Ĺ��");
		TreeSet<Student1> set1 = makeTreeSet(list, null);
		System.out.println(set1);
		System.out.println("�������� �������� ����");
		TreeSet<Student1> set2 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.getTotal() - o1.getTotal();
			}
		});
		System.out.println(set2);
		System.out.println("���� ������������ ����");
		TreeSet<Student1> set3 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.kor - o1.kor;
			}
		});
		System.out.println(set3);
		System.out.println("���� ������������ ����");
		TreeSet<Student1> set4 = makeTreeSet(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o2.eng - o1.eng;
			}
		});
		System.out.println(set4);
		System.out.println("���� ������������ ����");
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