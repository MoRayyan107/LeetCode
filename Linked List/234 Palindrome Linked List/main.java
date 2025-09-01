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

// Time complexity -> O(n), Space Complexity -> O(1)
class Solution {

    public ListNode linkedListMiddleNode(ListNode head){
        // using the hare and turtle strategy 
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public ListNode reveresedLinkedList(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public boolean isPalindrome(ListNode head) {
        // base case if NO Node or ONE Node is present 
        // always true
        if (head == null || head.next == null)
            return true; 
    
        // first find the mid node of our Linked List 
        ListNode firstHalf = linkedListMiddleNode(head);

        // then reverse the second or first half of the list 
        // here im going with 2nd
        // gets the head of the reversed linked list
        ListNode secondHalf = reveresedLinkedList(firstHalf.next);

        // temp variale to point to head 
        ListNode headNode = head;
        while(secondHalf != null){
            if (headNode.val != secondHalf.val)
                return false;
            headNode = headNode.next;
            secondHalf = secondHalf.next;
        }

        return true; // if all operations work fine 
    }
}
