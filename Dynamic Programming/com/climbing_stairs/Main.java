package com.climbing_stairs;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n) {
		if(n <= 1) return 1;
		int way[] = new int[n+1];
		way[0] = 1;
		way[1] = 1;
		for(int i=2; i<=n; i++) {
			way[i] = way[i - 2] + way[i - 1]; 
		}
		return way[n];
	}

}
