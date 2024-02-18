package chapter11.weeklyquiz;

import java.util.Scanner;
import java.util.Stack;

public class WeeklyQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		String input = scanner.nextLine();
		int cnt1 = 0, cnt2 = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(') {
				cnt1++;
				stack.push(ch);
			} else if (ch == ')') {
				cnt2++;
				if (stack.isEmpty()) {
					System.out.println("false");
					return;
				} else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty() && cnt1 == cnt2)
			System.out.println("true");
		else if (stack.contains('('))
			System.out.println("false");
	}
}
