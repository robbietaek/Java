package chap14;

import java.util.*;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i = 0; i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println(map.get("ȫ�浿"));
		System.out.println(map.get("���"));
		System.out.println(map.get("�̸���"));
		
		//Key ���鸸 ��ȸ
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "�� ��ȣ"+map.get(k));
		}
		
		//Value���鸸 ��ȸ
		System.out.println("Value ���鸸 ��ȸ");
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
		
		//Key,Value�� ���� ��ü�� ��ȸ
		System.out.println("Key,Value ���� ��ü�� ��ȸ");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "�� ��ȣ : " + m.getValue());
		}
	}
}
