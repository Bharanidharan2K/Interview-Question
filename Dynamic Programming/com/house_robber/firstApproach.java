package com.house_robber;

public class firstApproach {

	public static void main(String[] args) {
		int []nums = {2,7,9,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
		int rob1 = 0, rob2 = 0;
		for(int i : nums) {
			int temp = Math.max(rob1 + i, rob2);
			rob1 = rob2;
			rob2 = temp;
		}
		return rob2;
	}
}
