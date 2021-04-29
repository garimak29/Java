package com.example.practice;

import java.util.Stack;

public class RedundantBraces {
	public static int braces(String A) {
		int res = 0;
		Stack stack = new Stack();
		int consequtiveOpenBraces = 0, totalBraces = 0, consequtiveClosedBraces = 0;
		for (int i = 0; i < A.length(); i++) {
			System.out.println(stack);
			if(A.charAt(i)!=')')
				stack.push(A.charAt(i));
			else
			{
				int count = 0;
				while(stack.size() > 0 && (char)stack.peek() != '(')
				{
					count++;
					stack.pop();
					System.out.println(count);
					
				}
				if(stack.size() > 0 && (char)stack.peek() == '(')
					stack.pop();
				if(count == 0 || count ==1) {
					res++;
				}
			}
		}
		if(res > 0)
			return 1;
		else return 0;
		
	}

}
