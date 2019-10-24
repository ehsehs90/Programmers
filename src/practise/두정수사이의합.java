package practise;

public class 두정수사이의합 {
	static int a = -199999;
	static int b = 3;

	 static public long solution(int a, int b) {
	      long answer = 0;
	      long sum =0;
	      long min =0;
	      long max =0;	      
	      if(a>=b){
	          max = a;
	          min = b;
	      }else{
	          max = b;
	          min = a;
	      }
	      
	      for(long i=min ; i< max+1;i++){          
	          sum +=i;
	      }
	       answer = sum;
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(a,b));
		//System.out.println();

	}

}
