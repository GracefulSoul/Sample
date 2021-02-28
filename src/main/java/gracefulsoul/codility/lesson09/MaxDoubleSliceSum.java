package gracefulsoul.codility.lesson09;


public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,6,-1,4,5,-1,2}));
	}
	
	// https://app.codility.com/demo/results/training2NZP2A-CHP/
	private static int solution(int[] A) {
		int result = 0;
		if (A.length == 3) {
			return 0;
		}
		int[] firstSlice = new int[A.length];
		for (int idx = 1; idx < A.length - 1; idx++) {
			firstSlice[idx] = Math.max(0, firstSlice[idx - 1] + A[idx]);
		}
		int[] secondSlice = new int[A.length];
		for (int idx = A.length - 2; idx >= 1; idx--) {
			secondSlice[idx] = Math.max(0, secondSlice[idx + 1] + A[idx]);
		}
		// Calculate max(result) value.
		for (int idx = 1; idx < A.length - 1; idx++) {
			int temp = firstSlice[idx - 1] + secondSlice[idx + 1];
			if (temp > result) {
				result = temp;
			}
		}
		return result;
	}

}
