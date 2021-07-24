package com.string_to_integer;

public class Main {

	public static void main(String[] args) {
		String s = "   -42";
		System.out.println(myAtoi(s));
		s = "4193 with words";
		System.out.println(myAtoi(s));
		s = "words and 987";
		System.out.println(myAtoi(s));
		s = "-91283472332";
		System.out.println(myAtoi(s));
		s = " ";
		System.out.println(myAtoi(s));

	}
	public static int myAtoi(String s) {
        if(s.isEmpty() || s == null) return 0;
        int i = 0, sign = 1, n = s.length();
        while(i < n && s.charAt(i) == ' ') {
        	i++;
        }
        if(i >= n) return 0; // This condition is for empty with space string (" ")
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
        	sign = s.charAt(i) == '+' ? 1 : -1;
        	i++;
        }
        long res = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
        	res = (res * 10) + s.charAt(i) - '0';
        	i++;
        	if(res * sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE) {
        		return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	}
        }
        return (int) res * sign;
    }
}
