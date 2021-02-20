package gracefulsoul.blog.fp.firstclass;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PassingAFunctionToAnotherFunction {
	public static void main(String[] args) {
		IntStream.range(1, 6).boxed().collect(Collectors.toList()).sort((x, y) -> y - x);
	}
}
