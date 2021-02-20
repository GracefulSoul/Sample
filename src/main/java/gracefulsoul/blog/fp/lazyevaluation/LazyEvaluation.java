package gracefulsoul.blog.fp.lazyevaluation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LazyEvaluation {
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 31)
				.filter(num -> {
					System.out.println(num + " % 2 : " + num % 2);
					return num % 2 == 0;	
				})
				.filter(num -> {
					System.out.println(num + " % 3 : " + num % 3);
					return num % 3 == 0;
				})
				.map(num -> {
					System.out.println(num + " / 6 : " + num / 6);
					return num / 6;
				})
				.boxed()
				.collect(Collectors.toList());
		System.out.println(numbers);
	}
}
