package chapter13.dailyquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMoreBigNumber {
	//N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램

	public List<Integer> solution(int n, int[] array) {
		List<Integer> answer = new ArrayList<>();

		answer.add(array[0]);
		for (int i = 1; i < n; i++) {
			if (array[i - 1] < array[i])
				answer.add(array[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int[] array = new int[number];

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}

		for (int x : printMoreBigNumber.solution(number, array)) {
			System.out.print(x + " ");
		}
	}
}
