package com.reverse_linked_list;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		ListNode result = reverseList(head);
		while(result != null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode new_node = head.next;
			head.next = prev;
			prev = head;
			head = new_node;
		}
		return prev;
	}

}
