package com.symmetric_tree;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode sec = new TreeNode(2);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		TreeNode sixth = new TreeNode(4);
		TreeNode seventh = new TreeNode(3);
		
		root.left = sec;
		root.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		third.right = seventh;
		System.out.println(isSymmetric(root));
	}
	public static boolean isSymmetric(TreeNode root) {
		return root == null || check(root.left, root.right);
	}
	public static boolean check(TreeNode leftSubTree, TreeNode rightSubTree) {
		if(leftSubTree == null && rightSubTree == null) return true;
		else if(leftSubTree != null && rightSubTree != null) {
			return leftSubTree.val == rightSubTree.val &&
					check(leftSubTree.left, rightSubTree.right) &&
					check(leftSubTree.right, rightSubTree.left);
		}
		return false;
	}

}
