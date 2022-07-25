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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k < 1) return head; 
        
        int len = 0;
        
        ListNode temp = head;
        
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        
        k %= len;
        
        int count = 0;
        temp = head;
        
        if(k == 0) return head;
        
        while(++count != len - k) {
            
            temp = temp.next;
        }
        ListNode next = temp.next;
        temp.next = null;
       
        temp = next;
        while(temp.next != null) temp = temp.next;
        
        temp.next = head;
        
        return next;
    }
    
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null) {
            
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        } 
        
        return prev;
    }
}