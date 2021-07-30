package com.convert_sorted_array_to_binary_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		int nums[] = {-10,-3,0,5,9};
		TreeNode result = sortedArrayToBST(nums);
		printPreOrder(result);
	}
	public static void printPreOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
		while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=0; i<n; i++){
                TreeNode current = queue.remove();
                list.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		return constructTree(nums, 0, nums.length-1);
	}
	public static TreeNode constructTree(int [] nums, int left, int right) {
		if(left> right) return null;
		int mid = left + (right - left) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructTree(nums, left, mid -1);
		root.right = constructTree(nums, mid + 1, right);
		return root;
	}

}
