/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Time complexity -> O(n), Space Complexity -> O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        boolean cycleFound = false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                cycleFound = true;
                break;
            }
        }

        if (!cycleFound) return null; // no cycle is found 

        fast = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow; 
    }
}
