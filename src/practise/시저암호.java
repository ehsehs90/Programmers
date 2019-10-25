package practise;

public class 시저암호 {
	static String s = "Z";
	static int n = 1;

	static public String solution(String s, int n) {
		String answer = "";
		// n = (char)n - '숫자';
		// String nn = Integer.toString(n);
//		System.out.println('a');
		System.out.println('a' + 1);
		System.out.println('z' + 1);
		System.out.println((int)'A');
		System.out.println(' '+1); //공백 32

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i); // 추출
			
			if(c >= 'A' && c <= 'Z') {
				c = (char) (c + n); // 밀기
				if(c > 90)
					c -= 26;
			}
			else if(c >= 'a' && c <= 'z'){
				c = (char) (c + n);
				if(c>122)
					c -= 26;
			}
			else if(c == ' ') {
				
			}
			answer += c;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(s, n);
	}

}
