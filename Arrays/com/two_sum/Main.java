package com.two_sum;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int result[] = twoSum(nums, target);
		for(int i: result) {
			System.out.print(i+" ");
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return result;
	}

}
