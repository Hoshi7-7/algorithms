package linkedList;

public class ReverseLinkedListPrev {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /*
        https://leetcode.com/problems/reverse-linked-list/description/
        Time complexity: O(n), where n is the number of nodes in the linked list.
        Space complexity: O(1), since we are using only a few pointers.
        This solution reverses the linked list in place by iterating through the list and reversing the pointers.
    */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
        }

        return prev;
    }
}
