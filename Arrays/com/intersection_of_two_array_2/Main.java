package com.intersection_of_two_array_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int nums1[] = {4,9,5};
		int nums2[] = {9,4,9,8,4};
		int result[] = intersect(nums1, nums2);
		for(int i : result) {
			System.out.print(i+ " ");
		}
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		List<Integer> list = new ArrayList<>();
		for(int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if(count > 0) {
				list.add(num);
				map.put(num, count - 1);
			}
		}
		int result[] = new int[list.size()];
		int index = 0;
		for(int i : list) {
			result[index++] = i;
		}
		return result;
	}

}
