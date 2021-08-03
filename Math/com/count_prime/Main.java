package com.count_prime;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countPrimes(n));
	}
	public static int countPrimes(int n) {
		boolean []a = new boolean[n];
		Arrays.fill(a, true);
		for(int i=2; i*i<n; i++) {
			if(a[i] == true) {
				for(int j=2; j*i<n; j++) {
					a[i*j] = false;
				}
			}
		}
		int count = 0;
		for(int i=2; i<n; i++) {
			if(a[i]) {
				count++;
			}
		}
		return count;
	}

}
