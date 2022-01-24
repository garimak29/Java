package recurrsion;

import java.util.ArrayList;

public class StringPermutation {

	public static ArrayList<String> solve(String str){
		ArrayList<String> res = new ArrayList<String>();
		//for(int i =0;i<str.length();i++) {
			res.add(generate("",str));
		
		return res;
	}
	private static String generate(String prefix, String str ) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			return prefix;
		}
		
			for(int j =0;j<str.length();j++)
				generate(prefix+str.charAt(j) , str.substring(0,j)+str.substring(j+1,str.length()));
		
	//	return null;
		return prefix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		System.out.println(solve(str));
	}

}
