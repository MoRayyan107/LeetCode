
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

// time complexity -> O(n)
// Space Complexity -> O(n)
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // make a result ListNode and have its pointer
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0; // carry for the sum between two numbers 

        while(l1 != null || l2 != null){ // if the nodes l1 and l2 are not null
        // reset the sum, and re-initialise with carry digit
            int sum = carry;

            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            ptr.next = new ListNode(sum % 10); // create new node of sum
            ptr = ptr.next;
        }

        if (carry > 0) ptr.next = new ListNode(carry); // if carry present at end, add a new ListNode

        return result.next; // return the values

    }
}
