package com.binary_tree_level_order_traversal;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {}
	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
