package com.example.practice;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {
	public static int solve(String A) {
		HashMap<Character , Character> map = new HashMap<Character , Character>();
		Stack stack = new Stack();
		int res = 1 ;
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		int pushOp =0;
		for(int i =0;i<A.length();i++) {
			if(map.containsKey(A.charAt(i)))
				{stack.push(A.charAt(i));
				pushOp ++;
				}
				
			else if( stack.size() > 0 && map.get(stack.peek()) == A.charAt(i) )
				{
					stack.pop();
				}
			else 
				return 0;
				
		}
		
	//	System.out.println(stack.size());
		if(stack.size() > 0 || (stack.size() == 0 && pushOp == 0))
			return 0;
		
		return res ;
		
    }

}
