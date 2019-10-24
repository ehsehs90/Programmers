package hash;

import java.util.Arrays;

//중복제거 못함...
public class 완주하지못한선수_sol {

	static String[] participant = { "mislav", "stanko", "mislav", "ana" };
	static String[] completion = { "stanko", "ana", "mislav" };

	static public String solution(String[] participant, String[] completion) {
		String answer = "";
		String temp = "";

		Arrays.sort(participant);
		for(int i=0 ;i<participant.length;i++) {
		System.out.println(participant[i]);
		}
		
		Arrays.sort(completion);
		for(int i=0 ;i<completion.length;i++) {
		System.out.println(completion[i]);
		}
	
		int i = 0;
		while (i < completion.length) {
			if (!completion[i].equals(participant[i])) {
				temp= participant[i];
				break;
			}else {
				i++;
			}
		}
		if(!temp.equals("")) {
			answer=temp;
		}else {
			answer=participant[i];
		}
			

		return answer;
	}

	public static void main(String[] args) {
		String a = solution(participant, completion);
		System.out.println(a);
	}
}