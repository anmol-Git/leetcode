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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        ListNode head = new ListNode();
        ListNode temphead = head;
        
        temphead.val = l1.val + l2.val;
        
        int carry = 0;
        
        if(temphead.val > 9) {
            carry = temphead.val/10;
            temphead.val = temphead.val%10;
        }
        
        l1 = l1.next;
        l2 = l2.next;
        
        while(l1 != null && l2 != null) {
            
            ListNode temp = new ListNode(l1.val + l2.val + carry);
            
            carry = 0;
            
           if(temp.val > 9) {
               
            carry =  temp.val/10;
            temp.val = temp.val%10;
           }
            
            temphead.next = temp;
            temphead = temphead.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null) {
            ListNode temp = new ListNode(l1.val + carry);
            
            carry = 0;
            
            if(temp.val > 9) {
               
            carry =  temp.val/10;
            temp.val = temp.val%10;
                
           } 
            
             temphead.next = temp;
            temphead = temphead.next;
            
           if(carry == 0) {
               temphead.next = l1.next;
               break;
           }
           else l1 = l1.next; 
            
        }
        
        while(l2 != null) {
            ListNode temp = new ListNode(l2.val + carry);
            
            carry = 0;
            
            if(temp.val > 9) {
               
            carry =  temp.val/10;
            temp.val = temp.val%10;
                
           } 
             temphead.next = temp;
            temphead = temphead.next;
            
           if(carry == 0) {
               temphead.next = l2.next;
               break;
           }
           else l2 = l2.next; 
            
        }
        
        if(carry != 0) {
            ListNode finalNode = new ListNode(carry);
            temphead.next = finalNode;
        }
        
        return head;
    }
}