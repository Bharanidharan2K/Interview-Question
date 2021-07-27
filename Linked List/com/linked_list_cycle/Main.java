package com.linked_list_cycle;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(0);
		ListNode fourth = new ListNode(-4);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = sec; // This is Position in 1
		System.out.println(hasCycle(head));
	}
	public static boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast ) return true;
		}
		return false;
	}

}
