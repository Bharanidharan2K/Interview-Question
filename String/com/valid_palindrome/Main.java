package com.valid_palindrome;

public class Main {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int l = 0, r = s.length() -1;
		while(l < r) {
			if(s.charAt(l) == s.charAt(r)) {
				l++;
				r--;
			}
			else return false;
		}
		return true;
	}

}
