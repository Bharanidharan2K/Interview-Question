package com.maximum_depth_of_binary_tree;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode sec = new TreeNode(9);
		TreeNode third = new TreeNode(20);
		TreeNode fourth = new TreeNode(15);
		TreeNode fifth = new TreeNode(7);
		root.left = sec;
		root.right = third;
		third.left = fourth;
		third.right = fifth;
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
	}

}
