package linkedList;

public class DeleteNode {
    /*
        https://leetcode.com/problems/delete-node-in-a-linked-list/description/
        Time complexity: O(n), where n is the number of nodes in the linked list.
        Space complexity: O(1), since we are using only a few pointers.
        This solution deletes a node from a singly linked list by copying the value of the next node
        into the current node and then removing the next node.
     */
    public void deleteNode(LinkedListCycle.ListNode node) {

        LinkedListCycle.ListNode lastNode = null;
        while(node.next != null){
            lastNode = node;
            int nextVal = node.next.val;
            node.val = nextVal;
            node = node.next;
        }

        lastNode.next = null;
    }
}
