package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEx10 {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 55, 60, "�İ�"),
			new Student("�̸���", 95, 90, "�濵"), new Student("���", 75, 80, "�ɸ�"), new Student("�Ӳ���", 65, 70, "����"),
			new Student("������", 65, 0, "�İ�"));

	public static void main(String[] args) {
		System.out.println("���������� 60�� �̻��� �л��� ���� ��� : " + avg1(t -> t.getEng() >= 60));
		System.out.println("���������� 60�� �̻��� �л��� ���� ��� : " + avg2(t -> t.getMath() >= 60));
		System.out.println("�İ��� �л��� ���� ��� : " + avg3(t -> t.getMajor().equals("�İ�")));
		System.out.print("�İ��� �л� �̸� : ");
//		nameList();
		nameList(t->t.getMajor().equals("�İ�"));
		System.out.println("�İ����� �ƴ� �л��� ���� ��� : " + avg4(t -> t.getMajor().equals("�İ�")));
		nameList(t->!t.getMajor().equals("�İ�"));
	}
	
	private static double avg1(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double) sum / count;
	}

	private static double avg2(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum += s.getMath();
			}
		}
		return (double) sum / count;
	}

	private static double avg3(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double) sum / count;
	}

//	private static void nameList() {
//		for (Student s : list) {
//			if (s.getMajor().equals("�İ�")) {
//				System.out.print(s.getName() + ",");
//			}
//		}
//		System.out.println();
//	}

	private static void nameList(Predicate<Student> pr) {
		for(Student s : list) {
			if(pr.test(s)) {
				System.out.print(s.getName() + ",");
			}
		}
	}
	
	private static double avg4(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (!pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double) sum / count;
	}

}
