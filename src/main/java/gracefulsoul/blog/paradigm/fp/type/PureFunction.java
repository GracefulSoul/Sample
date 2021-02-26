package gracefulsoul.blog.paradigm.fp.type;

import java.time.LocalDateTime;

public class PureFunction {
	public static void main(String[] args) throws InterruptedException {
		for (int count = 0; count < 5; count++) {
			System.out.println(nonPureFunction());
			System.out.println(pureFunction(1000, 5));
			Thread.sleep(1000L);
		}
	}
	private static LocalDateTime nonPureFunction() {
		return LocalDateTime.now();
	}
	private static int pureFunction(int price, int num) {
		return price * num;
	}
}
