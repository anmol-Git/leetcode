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
        
        if(head == null) return head;
        
        ListNode temp = head;
        ListNode reverseHead = new ListNode(head.val);
        temp = temp.next;
        while(temp != null) {
            
            ListNode temphead = reverseHead;
            reverseHead = new ListNode(temp.val);
            reverseHead.next = temphead; 
            
            temp = temp.next;
            
        }
        
        return reverseHead;
    }
}