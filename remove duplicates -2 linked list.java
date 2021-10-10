// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/
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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode curr = head ; 
        ListNode dummyNode = new ListNode(-1);
        ListNode tempTail = dummyNode;
        
        while(curr!=null) {// some condition
            
            if(curr.next == null || curr.next.val != curr.val){
                tempTail.next = curr;
                tempTail = curr;
                curr= curr.next;
            } else {
                // if similiar elements
                int temp = curr.val;
                while(curr!=null && curr.val == temp){
                    // do nothing just skip it
                    curr= curr.next; 
                }
            }
        }
        // in case if link is like 10-30-30
        // the dumynode tail will still point to 30 -30 
        // so ditach it do tempTail.next = null
        tempTail.next = null;
        return dummyNode.next;
        
    }
}
