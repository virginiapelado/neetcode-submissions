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
        ListNode mergedList = new ListNode(0);
        ListNode node = mergedList;

        // while both lists have nodes, compare and attach the smaller one
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next; 
            }
            node = node.next;
        }

        // attach the remaning nodes the list that is not empty yet
        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        // return the merged list (ignore head node that is 0 that we had to add for the dummy)
        return mergedList.next;
    }
}