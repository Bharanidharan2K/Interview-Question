package com.validate_binary_search_tree;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode sec = new TreeNode(1);
		TreeNode third = new TreeNode(3);
		root.left = sec;
		root.right = third;
		System.out.println(isValidBST(root));
	}
	public static boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		Double left_child = -Double.MAX_VALUE;
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if(root.val <= left_child) return false;
			left_child = (double) root.val;
			root = root.right;
		}
		return true;
	}

}
