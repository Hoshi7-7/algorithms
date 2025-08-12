package linkedList;

public class LinkedListCycle {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // https://leetcode.com/problems/linked-list-cycle/description/
    // Floyd's Cycle Detection Algorithm (Tortoise and Hare)
    // Time complexity: O(n), where n is the number of nodes in the linked list.
    // Space complexity: O(1), since we are using only two pointers.
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }
}
