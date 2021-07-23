package com.move_zeros;

public class Main {

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		System.out.println("Before: ");
		for(int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		moveZeroes(nums);
		System.out.println("After: ");
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
	public static void moveZeroes(int[] nums) {
		int n = nums.length - 1;
		int l = 0, r = 0;
		while(r <= n) {
			if(nums[r] == 0) r ++;
			else {
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				l++;
				r++;
			}
		}
	}

}
