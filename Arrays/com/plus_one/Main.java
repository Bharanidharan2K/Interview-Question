package com.plus_one;

public class Main {

	public static void main(String[] args) {
		int digits[] = {9,1,9,9};
		for(int i : plusOne(digits)) {
			System.out.print(i+" ");
		}
	}
	public static int[] plusOne(int[] digits) {
		int n = digits.length - 1;
		while(n >= 0) {
			if(digits[n] == 9) digits[n] = 0;
			else {
				digits[n]++;
				return digits;
			}
			n--;
		}
		int result[] = new int[digits.length+1];
		result[0] = 1;
		return result;
	}

}
