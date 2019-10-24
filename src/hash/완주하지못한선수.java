package hash;

import java.util.ArrayList;


//중복제거 못함...
public class 완주하지못한선수 {

	static String[] participant = {"mislav", "stanko", "mislav", "ana" };
	static String[] completion = { "stanko", "ana", "mislav" };

	static public String solution(String[] participant, String[] completion) {
		 String answer = "";

		ArrayList<String> arr = new ArrayList<String>();
		
		for (int i = 0; i < participant.length; i++) {
			arr.add(participant[i]);
		}

		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					arr.remove(participant[j]);

				}
			}
		}

		
		for (int i=0;i<arr.size();i++) {			
			answer=arr.get(i);
		}


		return answer;
	}

	public static void main(String[] args) {
		String a=solution(participant, completion);
		System.out.println(a);
	}
}