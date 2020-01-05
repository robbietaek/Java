package kkt20191008;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Exam1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		List<KKTEmp> list = br.lines().map(s -> {

			String[] kkt = s.split(",");
			String temp = "";

			try {
				kkt[4] = temp;
			} catch (Exception e) {
				temp = "";
			}

			return new KKTEmp(kkt[0], kkt[1], kkt[2], Integer.parseInt(kkt[3]));
		}).collect(Collectors.toList());

		System.out.println("========직원 목록 보기(이름순)=========");
		list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);

		System.out.println("=========직원 목록 보기(나이순)==========");
		list.stream().sorted((s1, s2) -> s1.getAge() - s2.getAge()).forEach(System.out::println);

		System.out.print("직급이 과장인 직원의 평균 나이 :");
		double avg = list.stream().filter(s -> s.getPosition().equals("과장")).mapToDouble(s -> s.getAge()).average()	.getAsDouble();
		System.out.println(avg);

	}

}
