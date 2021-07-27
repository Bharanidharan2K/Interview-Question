package com.palindrome_linked_list;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(1);
		
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		boolean result = isPalindrome(head);
		System.out.println(result);
	}
	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverseList(slow);
		fast = head;
		while( slow != null ) {
			if(slow.val != fast.val ) return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while( head != null ) {
			ListNode newNode = head.next;
			head.next = prev;
			prev = head;
			head = newNode;
		}
		return prev;
	}

}
