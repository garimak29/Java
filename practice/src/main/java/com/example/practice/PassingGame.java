package com.example.practice;

import java.util.ArrayList;
import java.util.Stack;

public class PassingGame {
	 public int solve(int A, int B, ArrayList<Integer> C) {
	    int res = 0;
	    Stack stack = new Stack();
	    for (int i =0;i<C.size();i++) {
	    	if(C.get(i) == 0 && i>=0) {
	    		stack.pop();
	    	}
	    	else
	    		stack.push(C.get(i));
	    	
	    }
	    if(stack.size() > 0)
	    	res = (int) stack.get(stack.size()-1);
	    else 
	    	res = B;
	    return res;
	 
	 }
}
