package practise;

public class 수박수박수박수박 {

	static int n=3;
	static public String solution(int n) {
		String answer = "";
		
		
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				answer+="박";
			}else {
				answer+="수";				
			}		
			
		}      
	     System.out.println(answer); 
	      return answer;
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(n);

	}

}
