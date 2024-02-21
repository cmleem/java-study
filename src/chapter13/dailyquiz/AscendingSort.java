package chapter13.dailyquiz;

import java.util.Scanner;

public class AscendingSort {
	//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램

	public int[] solution(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];

		/*int index = 0, i = 0, j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				result[index] = array1[i];
				index++;
				i++;
			} else {
				result[index] = array2[j];
				index++;
				j++;
			}
		}

		while (i < array1.length) {
			result[index] = array1[i];
			index++;
			i++;
		}
		while (j < array2.length) {
			result[index] = array2[j];
			index++;
			j++;
		}*/

		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			result[i + array1.length] = array2[i];
		}

		int tmp;
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] > result[j]) {
					tmp = result[i];
					result[i] = result[j];
					result[j] = tmp;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		AscendingSort ascendingSort = new AscendingSort();
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

		for (int x : ascendingSort.solution(array, array2)) {
			System.out.print(x + " ");
		}
	}
}
