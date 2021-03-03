package gracefulsoul.paradigm.fp;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		// Enhanced for loop
		for (String movie : getSample()) {
			System.out.println(movie);
		}
		// Lambda
		getSample().forEach(System.out::println);
	}
	private static List<String> getSample() {
		List<String> sample = new ArrayList<>();
		sample.add("A Dog's Purpose");
		sample.add("The Call of the Wild");
		return sample;
	}
}
