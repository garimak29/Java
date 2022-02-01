package recurrsion;

public class ReverseTheNumber {

	public static int reverse(int n){
		int digits = (int) Math.log10(n) +1;
		return helper(n , digits);

	}

	private static int helper(int n, int digits) {
		if(n%10 == n)
			return n;
		return (int) ((n%10)*(Math.pow(10,digits-1)) + helper(n/10 , digits-1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(12389));
	}

}
