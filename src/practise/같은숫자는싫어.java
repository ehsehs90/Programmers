package practise;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

	static int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

	static public int[] solution(int[] arr) {
		int[] answer = {};
		int num = 10;
		List<Integer> array = new ArrayList<Integer>();

//		int[] a = Arrays.

		for (int n : arr) {
			if (num != n) {
				array.add(n);
				num = n;

			}
		}
		System.out.println(array);

		for (int i = 0; i < array.size() - 1; i++) {
			answer[i] = array.get(i);
		}

		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(arr);
	}

}
