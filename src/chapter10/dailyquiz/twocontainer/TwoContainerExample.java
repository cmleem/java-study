package chapter10.dailyquiz;

public class TwoContainerExample {
	public static void main(String[] args) {
		TwoContainer<String, String> container = new TwoContainer<>();
		container.set("홍길동", "도적");
		String name = container.getKey();
		String job = container.getValue();
		System.out.printf("%s %s", name, job);

		TwoContainer<String, Integer> secondContainer = new TwoContainer<>();
		secondContainer.set("홍길동", 35);
		String name2 = secondContainer.getKey();
		Integer age = secondContainer.getValue();
		System.out.printf("%s %s", name2, age);
	}
}
