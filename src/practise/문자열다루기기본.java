package practise;

public class 문자열다루기기본 {

	static String s = "a234";

	static public boolean solution(String s) {
		boolean answer = true;
		
		// System.out.println(s.length());
		if (s.length() == 4 | s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				// ASCII코드
				if (c < '0' || c > '9') {
					return false;
				}
			}

		}
			answer = false;
		
		
		System.out.println(answer);
		
		return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(s);
	}

}
