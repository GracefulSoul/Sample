package gracefulsoul.paradigm.fp.firstclass;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturningFunctionsFromFunctions {
	public static void main(String[] args) {
		IntStream.range(1, 6).boxed().collect(Collectors.toList()).sort(getSort());
	}
	// Returns the function as a result.
	private static Comparator<Integer> getSort() {
		return (x, y) -> y - x;
	}
}
