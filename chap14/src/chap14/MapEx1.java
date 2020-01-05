package chap14;

import java.util.*;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i = 0; i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println(map.get("È«±æµ¿"));
		System.out.println(map.get("±è»ñ°«"));
		System.out.println(map.get("ÀÌ¸ù·æ"));
		
		//Key °ªµé¸¸ Á¶È¸
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "ÀÇ ¹øÈ£"+map.get(k));
		}
		
		//Value°ªµé¸¸ Á¶È¸
		System.out.println("Value °ªµé¸¸ Á¶È¸");
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
		
		//Key,ValueÀÇ ½ÖÀÎ °´Ã¼·Î Á¶È¸
		System.out.println("Key,Value ½ÖÀÎ °´Ã¼·Î Á¶È¸");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "ÀÇ ¹øÈ£ : " + m.getValue());
		}
	}
}
