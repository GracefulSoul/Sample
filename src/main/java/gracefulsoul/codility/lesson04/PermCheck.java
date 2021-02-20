package gracefulsoul.codility.lesson04;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,1,3,2}));
	}
	
	// https://app.codility.com/demo/results/trainingDCMXJY-HDN/
	private static int solution(int[] A) {
		Set<Integer> numSet = new HashSet<>();
        for (int num : A) {
            if (num > A.length || numSet.contains(num)) { // If over than array's size or duplicated number.
                return 0;
            } else {
                numSet.add(num);
            }
        }
        return 1;
	}
	
}
