package middletest.wordcheck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordInfo {
	private String longestWord;
	private Map<String, Integer> frequency;

	public String findLongestWord(List<String> list) {
		longestWord = list.getFirst();
		for (int i = 1; i < list.size(); i++) {
			if (longestWord.length() < list.get(i).length()) {
				longestWord = list.get(i);
			}
		}
		return longestWord;
	}

	public WordInfo() {
		this.frequency = new HashMap<>();
	}

	public Map<String, Integer> getFrequency(List<String> list) {
		Integer values = 1;
		frequency.put(list.getFirst(), values);

		for (int i = 1; i < list.size(); i++) {
			if (!frequency.containsKey(list.get(i))) {
				frequency.put(list.get(i), values);
			} else {
				frequency.put(list.get(i), ++values);
			}
		}
		return frequency;
	}
}
