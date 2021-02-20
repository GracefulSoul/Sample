package gracefulsoul.codility.lesson03;

public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}
	
	private static int solution(int X, int Y, int D) {
		return (int) Math.ceil((double)(Y - X) / D);
	}

}
