package chap16;

public class problem3 {
	public static void main(String[] args) throws Exception {

		SumThread[] st = new SumThread[10];
		int total = 0;
		int total1 = 0;
		for (int i = 0; i < st.length; i++) {
			st[i] = new SumThread(i * 100 + 1, (i + 1) * 100);
			st[i].start();
		}

		for (int i = 0; i < st.length; i++) {
			st[i].join();
			total += st[i].sum;
		}
		System.out.println("SumThread 로 했을 때 총합은" + total + "입니다.");

		SumRunnable[] sr = new SumRunnable[10];
		Thread[] t = new Thread[10];
		for (int i = 0; i < t.length; i++) {
			sr[i] = new SumRunnable(i * 100 + 1, (i + 1) * 100);
			t[i] = new Thread(sr[i]);
			t[i].start();
		}

		for (int i = 0; i < st.length; i++) {
			t[i].join();
			total1 += sr[i].sum;
		}
		System.out.println("SumRunnable 로 했을 때 총합은" + total1 + "입니다.");
	}
}
