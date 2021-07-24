package com.implement_strStr;

public class Main {

	public static void main(String[] args) {
		String haystack = "hello", needle = "ll";
		System.out.println(strStr(haystack, needle));
	}
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) return 0;
		int m = haystack.length();
		int n = needle.length();
		if(m < n) return -1;
		for(int i=0; i<m; i++) {
			if(haystack.substring(i, i+n).equals(needle))
				return i;
		}
		return -1;
	}

}
