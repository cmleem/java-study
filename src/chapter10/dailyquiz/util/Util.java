package chapter10.dailyquiz.util;

public class Util {

	public static <K, V> V getValue(Pair<K, V> pair, String key) {
		if (pair.getKey().equals(key))
			return pair.getValue();
		return null;
	}

	public static <K, V> V getValue(OtherPair<K, V> pair, String key) {
		throw new IllegalArgumentException("예외 발생");
	}
}
