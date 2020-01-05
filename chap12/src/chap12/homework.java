package chap12;
/*
2.
* ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
* �޼���� : fillZero
* ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���  �����, ���� �� ������ 0���� ä���.
*        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
*        ���� �־��� length�� ���� 0�� ���ų� ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
* ��ȯŸ�� : String
* �Ű����� : String src, int length
* 

[���]
0000012345

123
null
*/

import java.util.Random;

public class homework {
	public static void main(String[] args) {

		try {

			String src = "12345";
			System.out.println(fillZero(src, 10));
			System.out.println(fillZero(src, -1));
			System.out.println(fillZero(src, 3));
			System.out.println(fillZero(null, 3));

		} catch (NullPointerException e) {
			System.out.println("null");
		}

	}

	private static String fillZero(String src, int a) {

		String Zero = "0";
		StringBuffer sb = new StringBuffer();
		int cnt = a - src.length();

		String result = null;

		for (int i = 0; i < cnt; i++) {
			sb.append(Zero);
		}

		switch (a) {
		case 10:
			result = sb + src;
			break;
		case -1:
			result = "";
			break;
		case 3:
			result = src.substring(0, a);
			break;
		default:
			break;
		}

		return result;
	}

}