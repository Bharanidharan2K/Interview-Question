package com.remove_nth_node_from_end_of_list;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		int n =2;
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
		ListNode dummy_head = head;
		while(dummy_head != null) {
			System.out.print(dummy_head.val+" ");
			dummy_head = dummy_head.next;
		}
		System.out.println();
		ListNode result = removeNthFromEnd(head, n);
		while(result != null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy_head = new ListNode();
		dummy_head.next = head;
		ListNode slow = dummy_head;
		ListNode fast = dummy_head;
		for(int i=0; i<=n; i++) {
			fast = fast.next;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy_head.next;
	}

}
