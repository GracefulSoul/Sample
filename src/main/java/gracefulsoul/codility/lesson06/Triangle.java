package gracefulsoul.codility.lesson06;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {10, 2, 5, 1, 8, 20}));
		System.out.println(solution(new int[] {10, 50, 5, 1}));
	}
	
	private static int solution(int[] A) {
		int length = A.length;
		if (3 > length) {
			return 0;
		}
		Arrays.sort(A);
		for (int i = 0; i < length - 2; i++) {
			if ((long)A[i] + (long)A[i + 1] > A[i + 2]) {
				return 1;
			}
		}
		return 0;
    }

}
