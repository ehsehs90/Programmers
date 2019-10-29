package practise;

public class 문자열압축 {
	static String str = "aabbaccc";
	//static String str = "ababcdcdababcdcd";
	//static String str = "abcabcdede";
	//static String str = "abcabcabcabcdededededede";

	static public int solution(String s) {
		int answer = 0;

		// 8
		int strlength = str.length();
		// System.out.println(str.length());
		int count = 1;

		// i 4  3 2 1
		// j 01  0  0123456
		// i*j 0 4 8 12
		for (int i = str.length() / 2; i > 0; i--) {

			String result = "";
			int time = (str.length() / i) ;

			for (int j = 0; j < time-1; j++) {

				String temp = str.substring(i * j, i * (j + 1));
				System.out.println(temp);
				//String temp2 = str.substring(i*(j+1), i*(j+2));
				//System.out.println("temp2는?"+temp2);

				
				if (temp.equals( str.substring(i * (j + 1), i * (j + 2)))) {
					count++;
					System.out.println("count되었나요"+count);
				} else {
					if (count > 1) {
						result += count + str.substring(i * j, i * (j + 1));
					} else {

						result += str.substring(i * j, i * (j + 1));
						//System.out.println("else  의 result :" + result);
					}
					System.out.println("else밖의 result " + result);
					count=1;
					System.out.println("time"+time);
				}
				if(j ==time-2 ) {
					System.out.println("개쩐다리");
					if(count>1) {
					result += count +str.substring(i*(j+1),i*(j+2));
					}
					else {
						result += str.substring(i*(j+1),i*(j+2));
					}
				}

			}
			System.out.println("count는?" + count);
			System.out.println("result는?"+result);
			
			answer=result.length();
			System.out.println(answer);
		}
	

		return answer;
	}

	public static void main(String[] args) {
		solution(str);
	}
}
