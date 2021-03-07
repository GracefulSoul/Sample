package gracefulsoul.codility.lesson12;

public class CommonPrimeDivisors {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {15,10,3}, new int[] {75,30,5}));
	}
	
	// https://app.codility.com/demo/results/trainingBVXGXR-JH5/
	public static int solution(int[] A, int[] B) {
		int result = 0;
		for (int idx = 0; idx < A.length; idx++) {
			if (isSameDivisors(A[idx], B[idx])) {
				result++;
			}
		}
		return result;
	}
	
	// Check whether the sets of prime divisors of integers N and M are exactly the same.
	private static int getGcd(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		} else {
			return getGcd(num2, num1 % num2);
		}
	}
	
	// Euclidean algorithm.
	private static boolean isSameDivisors(int num1, int num2) {
		int gcd = getGcd(num1, num2);
		int quotient1 = 0;
		while (quotient1 != 1) {
			quotient1 = getGcd(num1, gcd);
			num1 /= quotient1;
		}
		int quotient2 = 0;
		while (quotient2 != 1) {
			quotient2 = getGcd(num2, gcd);
			num2 /= quotient2;
		}
		return (num1 == 1 && num2 == 1);
	}

}
