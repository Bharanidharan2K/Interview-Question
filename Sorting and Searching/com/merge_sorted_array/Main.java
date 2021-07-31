package com.merge_sorted_array;

public class Main {

	public static void main(String[] args) {
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int last = nums1.length -1;
		n -= 1; m -= 1;
		while(m >= 0 && n >= 0) {
			if(nums1[m] < nums2[n]) {
				nums1[last] = nums2[n];
				n--;
			}
			else {
				nums1[last] =nums1[m];
				m--;
			}
			last--;
		}
		while(n >= 0) {
			nums1[last] = nums2[n];
			n--;
			last--;
		}
		printFunction(nums1);
	}
	public static void printFunction(int nums[]) {
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
