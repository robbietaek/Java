package chap14;

import java.util.*;

public class problem4 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		String[] country = { "���ѹα�", "ĳ����", "����", "������" };
		String[] city = { "����", "��Ÿ��", "����", "����" };

		for (int i = 0; i < country.length; i++) {
			map.put(country[i], city[i]);
		}

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���� �Է��ϼ���. (����: exit)");
			String input = scan.next();

			if (input.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}

			if (map.get(input) == null) {
				System.out.println("��ϵ� ������ �����ϴ�. ����Ͻðڽ��ϱ�? (y/n)");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("y")) {
					System.out.println("������ �Է��ϼ���");
					String cityadd = scan.next();
					map.put(input, cityadd);
				}
			}
			System.out.println(map.get(input));
		}
		System.out.println(map);
	}
}
