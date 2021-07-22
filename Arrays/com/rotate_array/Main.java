package com.rotate_array;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println("Before Rotating the value :");
		for(int i : nums) {
			System.out.print(i+ " ");
		}
		System.out.println();
		rotate(nums, k);
		System.out.println("After Rotating the value :");
		for(int i : nums) {
			System.out.print(i+ " ");
		}
	}
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n; // This is for if the k is equal to n OR if the k is greater than n, So at that time we can ignore the rotation
		reverse(nums, 0, n-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, n-1);
		
	}
	public static void reverse(int nums[], int l, int r) {
		while(l < r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
			l++;
			r--;
		}
	}

}
