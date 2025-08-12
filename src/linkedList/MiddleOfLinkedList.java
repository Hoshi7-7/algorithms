package linkedList;

public class MiddleOfLinkedList {
// Definition for singly-linked list.
public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
/*
    https://leetcode.com/problems/middle-of-the-linked-list/description/
    Time complexity: O(n), where n is the number of nodes in the linked list.
    Space complexity: O(1), since we are using only a few pointers.
    This solution finds the middle node of a linked list by first counting the total number of nodes
    and then iterating to the middle node.

 */
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        int cont = 0;
        ListNode aux = head;
        while(aux!=null){
            aux = aux.next;
            cont++;
        }

        ListNode mid = head;
        for(int i=0;i<cont/2;i++){
            mid = mid.next;
        }

        return mid;
    }
}
