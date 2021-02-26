package gracefulsoul.blog.java.generic.parameterized.types;

import gracefulsoul.blog.java.generic.Box;

public class Main {

	public static void main(String[] args) {
		OrderedPair<String, Box<Integer>> pair = new OrderedPair<>("primes", new Box<Integer>());
	}

}
