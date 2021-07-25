package com.delete_node_in_a_linked_list;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		ListNode sec = new ListNode(5);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(9);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		ListNode node = sec;
		while(head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();
		deleteNode(node);
	}
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
