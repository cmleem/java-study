package middletest;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		//입력받은 수가 소수면 true, 소수가 아닌 수면 false 출력
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자(1~100)를 입력하세요: ");
		int num = scanner.nextInt();

		if (num < 1 || num > 100) {
			System.out.println("잘못된 숫자 입니다.");
		}

		for (int i = 1; i < num; i++) {
			if ((num % i) == 0) {
				System.out.println("false");
				return;
			}
		}
		for (int i = num + 1; i <= 100; i++) {
			if ((num % i) == 0) {
				System.out.println("false");
				return;
			}
		}

		System.out.println("true");
	}
}
