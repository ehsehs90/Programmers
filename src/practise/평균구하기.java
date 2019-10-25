package practise;

public class 평균구하기 {

	// static int[] arr = new int[100];
	static int[] arr = {1,2,3,4};

	static public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;

		for (int i=0 ;i<arr.length;i++) {

			sum += arr[i];
		}
		answer = (double) (sum) / arr.length;

		//System.out.println(sum);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(arr);
	}

}
