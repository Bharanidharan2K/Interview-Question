package com.contains_duplicate;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			if(set.contains(i)) return true;
			set.add(i);
		}
		return false;
	}

}
