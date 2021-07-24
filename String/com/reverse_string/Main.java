package com.reverse_string;

public class Main {

	public static void main(String[] args) {
		char s[] = {'h','e','l','l','o'};
		System.out.println("Before :");
		for(char i : s)
			System.out.print(i+" ");
		reverseString(s);
	}
	public static void reverseString(char[] s) {
		int l = 0, r = s.length-1;
		while(l <= r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		System.out.println("\nAfter :");
		for(char i : s)
			System.out.print(i+" ");
	}

}
