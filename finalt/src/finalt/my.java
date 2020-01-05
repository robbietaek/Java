package finalt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Myclass {
	String name;
	int age;
	String gender;

	public Myclass(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Myclass [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}

public class my {

	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader file = new BufferedReader(
				new FileReader("D:\\taek\\20190812\\sql\\workspace\\chap1\\finalt\\src\\finalt\\text.txt"));
		List<Myclass> list = file.lines().map(s -> {
			String str[] = s.split(",");
			String temp = "";

			try {
				str[3] = temp;
			} catch (Exception e) {
				temp = "";
			}

			return new Myclass(str[0], Integer.parseInt(str[1]), str[2]);
		}).collect(Collectors.toList());
		
		list.stream().sorted((s1,s2)->s1.age-s2.age).forEach(System.out::println);
	}
}
