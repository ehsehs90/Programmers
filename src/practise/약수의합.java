package practise;

public class 약수의합 {
	static int n = 12;

	static public int solution(int n) {
		int answer = 0;

		// 12 = 1 2 3 4 6 12

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {
				answer += i;
				//System.out.println(i);
			}
		}
		answer += n;

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(n);
	}

}
