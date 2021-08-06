package com.valid_paranthesis;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
		if(s.length() % 2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		for(Character c : s.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') stack.push(c);
			else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
			else stack.push(c);
		}
		return stack.isEmpty();
		
	}

}
