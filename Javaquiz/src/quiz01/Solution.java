package quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(n);

		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			list.add(n);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution S = new Solution();
		System.out.println(S.solution(10));
		System.out.println(S.solution(10).toString());
		System.out.println(Arrays.toString(S.solution(10)));
	}

}
