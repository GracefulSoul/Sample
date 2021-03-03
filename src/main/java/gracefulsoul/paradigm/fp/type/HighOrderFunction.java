package gracefulsoul.paradigm.fp.type;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighOrderFunction {
	public static void main(String[] args) {
		IntStream.range(1, 6).boxed().collect(Collectors.toList()).sort(reverse((x, y) -> x - y));
	}
	private static Comparator<Integer> reverse(Comparator<Integer> comparator) {
		return (x, y) -> comparator.compare(y, x);
	}
}
