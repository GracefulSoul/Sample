package gracefulsoul.blog.fp.firstclass;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StoringFunctionsInVariables {
	public static void main(String[] args) {
		Comparator<Integer> comparator = (x, y) -> y - x;
		IntStream.range(1, 6).boxed().collect(Collectors.toList()).sort(comparator);
	}
}
