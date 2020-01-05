package chap12;

public class problem5 {
	public static void main(String[] args) {
		String str = "°¡³ª´Ù";
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
		System.out.println(format(str,2,0));
	}

	private static String format(String str, int len, int align) {
		
		if(str.length() >= len) {
			return str.substring(0,len);
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<len;i++) {
			sb.append(" ");;
		}
		
		int l = len -str.length();
		
		switch(align) {
		case 0 : sb.replace(0, str.length(), str); break;
		
		case 1 : sb.replace(l/2, str.length()+l/2, str); break;
		
		case 2 : sb.replace(l, str.length() + l, str); break;
		}
		return sb.toString();
		
	}


}
