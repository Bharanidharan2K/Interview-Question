package com.merge_two_sorted_list;

public class Main {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode sec1 = new ListNode(2);
		ListNode third1 = new ListNode(4);
		l1.next = sec1;
		sec1.next = third1;
		ListNode l2 = new ListNode(1);
		ListNode sec2 = new ListNode(3);
		ListNode third2 = new ListNode(4);
		l2.next = sec2;
		sec2.next = third2;
		ListNode result = mergeTwoLists(l1, l2);
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode();
		ListNode currentNode = dummyNode;
		while( l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				currentNode.next = l1;
				l1 = l1.next;
			}
			else {
				currentNode.next = l2;
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}
		if(l1 != null) {
			currentNode.next = l1;
		}
		else {
			currentNode.next = l2;
		}
		return dummyNode.next;
	}

}
