package chap6;

public class problem3 {
public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,5,6,7,8,9};
	int[] num = new int[3];
		while(true) {
	for(int l = 0; l<10000;l++) {
		int i = (int)(Math.random()*9);
		int k = (int)(Math.random()*9);
		int tmp = arr[i];
		arr[i] = arr[k];
		arr[k] = tmp;		
	}
	
	for(int i = 0; i<num.length;i++) {
		num[i]=arr[i];
	}
	
	for(int n : num) {
		System.out.print(n);
	}
	System.out.println();
		}
}
}

