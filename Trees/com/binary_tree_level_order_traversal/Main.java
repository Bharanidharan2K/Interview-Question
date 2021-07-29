package com.binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
		System.out.println(levelOrder(root));
		
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if(root == null)return list;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int n = queue.size();
			List<Integer> subList = new ArrayList<>();
			for(int i=0; i<n; i++) {
				TreeNode currentNode = queue.remove();
				subList.add(currentNode.val);
				if(currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			list.add(subList);
		}
		return list;
	}

}
