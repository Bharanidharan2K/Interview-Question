package com.remove_duplicates_from_sorted_array;

public class Main {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int result[] = removeDuplicates(nums);
		for(Integer k : result) {
        	System.out.print(k+" ");
        }

	}
	public static int[] removeDuplicates(int[] nums) {
        int i =0;
        for(int j=0; j< nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        int result[] = new int[i+1];
        for(int j=0;j<=i;j++) {
        	result[j] = nums[j];
        }
        return result;
    }

}
