package chapter13.dailyquiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AscendingSortStream {
	//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램

	public int[] solution(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];

		result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
			.sorted().toArray();



		/*for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			result[i + array1.length] = array2[i];
		}
		result = Arrays.stream(result).sorted().toArray();*/

		return result;
	}

	public static void main(String[] args) {
		AscendingSortStream ascendingSortStream = new AscendingSortStream();
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int[] array = new int[number];

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}

		int number2 = scanner.nextInt();
		int[] array2 = new int[number2];

		for (int i = 0; i < number2; i++) {
			array2[i] = scanner.nextInt();
		}

		for (int x : ascendingSortStream.solution(array, array2)) {
			System.out.print(x + " ");
		}
	}
}