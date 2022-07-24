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
    public void reorderList(ListNode head) {
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(slow.next == null) return;
           
    ListNode last = reverse(slow.next);
        
         
        slow.next = null;
        
        slow = head;
        
         boolean even = true;
        while(last != null && slow != null) {
            
            ListNode temp = last;
            last = last.next;
            
            ListNode next = slow.next;
            slow.next = temp;
            slow = slow.next;
            slow.next = next;
            
            slow = slow.next;
        }      
    }       
    
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
}