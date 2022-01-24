package recurrsion;

public class Pallindrome {

	public static boolean checkPallindrome(String s) {
		boolean res = false;
		System.out.println(s.length());
		// base case
		if (s.length() == 1 || s.length() == 0) {
			System.out.println("in1");
			return true;
		} else {

			if (s.charAt(0) == s.charAt(s.length() - 1)) {
				System.out.println("in");
				return checkPallindrome(s.substring(1, s.length() - 1));
			} else
				return false;
		}

		// return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		System.out.println("final " + checkPallindrome(str));
	}

}
