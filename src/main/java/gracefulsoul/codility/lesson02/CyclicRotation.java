package gracefulsoul.codility.lesson02;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		print(solution(new int[] {3,8,9,7,6}, 3));
		print(solution(new int[] {1,2,3,4}, 4));
	}
	
	private static int[] solution(int[] A, int K) {
        int length = A.length;
        int[] result = new int[length];
        // Loop A's length.
        for (int idx = 0; idx < length; idx++) {
            // Move A[idx] value to result array.
            result[(length + idx + K) % length] = A[idx];
        }
        return result;
	}
	
	private static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
