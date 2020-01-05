package chap6;

public class problem2 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j = 0; j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println("\t\t\t\t나온 숫자는 "+arr[i] + " 입니다.");
		}
	}

}


