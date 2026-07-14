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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();
        while (list1 != null) {
            vals.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            vals.add(list2.val);
            list2 = list2.next;
        }
        
        Collections.sort(vals);

        ListNode sortedList = new ListNode(0);     // dummy 0 at the beginning to avoid handling the head differently, we can skip it later when returning teh value
        ListNode curr = sortedList;

        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }

        return sortedList.next;    // . next to ignore the first 0 we added
    }
}