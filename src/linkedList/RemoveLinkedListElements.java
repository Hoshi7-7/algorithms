package linkedList;

public class RemoveLinkedListElements{
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /*
        https://leetcode.com/problems/remove-linked-list-elements/description/
        Time complexity: O(n), where n is the number of nodes in the linked list.
        Space complexity: O(1), since we are using only a few pointers.
        This solution removes all elements from a linked list that have a specific value.
    */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the value
            } else {
                current = current.next; // Move to the next node
            }
        }

        return dummy.next; // Return the modified list, skipping the dummy node
    }
}
