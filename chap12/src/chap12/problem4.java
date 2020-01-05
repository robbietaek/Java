package chap12;

public class problem4 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)", "~!#$%^&*()"));
		System.out.println(delChar("(1!2@3^4~5)", "12345"));
	}

	static StringBuffer delChar(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(del.indexOf(ch)<0){
				sb.append(ch);
			}
		}
		return sb;
	}
}
