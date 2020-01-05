package chap14;

import java.util.*;

public class StackQueueEx1 {

	public static void main(String[] args) {
		String cars[] = { "�ҳ�Ÿ", "�׷���", "SM5", "K9" };
		Stack<String> stack = new Stack<String>();
		for (String s : cars) {
			stack.push(s);
		}
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		System.out.println(stack.peek());
		;
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());

		Queue<String> queue = new LinkedList<String>();
		for (String s : cars) {
			queue.offer(s);
		}
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		System.out.println(queue.peek());
		;
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());

	}

}
