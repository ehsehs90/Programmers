package practise;

public class 서울에서김서방찾기 {

	// static String[] seoul = new String[1000];
	static String[] seoul = { "", "Kim" };

	static String answer = "";

	static public String solution(String[] seoul) {
		String k = "";

		for (int i = 0; i < seoul.length; i++) {

			if ("Kim".equals(seoul[i])) {
				k = Integer.toString(i);
			}
		}
		answer = "김서방은 " + k + "에 있다";
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(seoul);

	}

}
