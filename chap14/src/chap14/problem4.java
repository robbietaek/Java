package chap14;

import java.util.*;

public class problem4 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		String[] country = { "대한민국", "캐나다", "영국", "스위스" };
		String[] city = { "서울", "오타와", "런던", "베른" };

		for (int i = 0; i < country.length; i++) {
			map.put(country[i], city[i]);
		}

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("나라를 입력하세요. (종료: exit)");
			String input = scan.next();

			if (input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			if (map.get(input) == null) {
				System.out.println("등록된 수도가 없습니다. 등록하시겠습니까? (y/n)");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("y")) {
					System.out.println("수도를 입력하세요");
					String cityadd = scan.next();
					map.put(input, cityadd);
				}
			}
			System.out.println(map.get(input));
		}
		System.out.println(map);
	}
}
