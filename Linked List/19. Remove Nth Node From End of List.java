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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // base case if theres only one element
        if (head.next == null)
            return null; // element removed 

        // calculating its size 
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }

        if (size == n || (size-n) == 0)
            return head.next;

        // calculate the prevNode Position
        int prevNodePos = size-n;

        // point the prevNode to Head
        ListNode prevNode = head;

        for(int i = 1; i < prevNodePos; i++){
            prevNode = prevNode.next;
        }

        prevNode.next = prevNode.next.next;
        return head;
    }
}
