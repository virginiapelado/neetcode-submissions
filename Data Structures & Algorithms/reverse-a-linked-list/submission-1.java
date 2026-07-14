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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;  // current pointer at head
        ListNode prev = null;  // prev pointer is null, we're at the start

        while (curr != null) {              // when the curr pointer points to null it means we're at the end of the list, there no node
            ListNode nextTemp = curr.next;  // save next
            curr.next = prev;               // reverse pointer
            prev = curr;                    // move prev forwards
            curr = nextTemp;                // move curr forward
        }

        return prev;            // at the end of the loop curr is null and prev is the original tail and how the head
    }
}
