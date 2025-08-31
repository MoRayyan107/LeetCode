/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Time Complexity -> O(n), Space Complexity -> O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        // create 3 pointers 
        // prev -> the previous value to the head (at start is null)
        // curr -> points at the Current head Node
        // next -> points to the next value of head

        ListNode prevNode = null;
        ListNode nextNode = null;
        ListNode currNode = head;

        // while the currNode is not null we iterate through the list 
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        // if currNode == null
        // the our prevNode points to the Starting node of reversed linked List
        // so head is re-initiated as prevNode
        head = prevNode; 

        return head;
    }
}
