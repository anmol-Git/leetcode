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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean even = false;
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        ListNode last = slow.next == null || fast == null ? reverse(slow) : reverse(slow.next);

        fast = head;
        
        while(last != null) {
            
            if(last.val != fast.val) return false;
            
            last = last.next;
            fast = fast.next;
            
        }
         
        
        return true;
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