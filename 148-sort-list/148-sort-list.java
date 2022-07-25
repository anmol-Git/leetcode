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
    public ListNode sortList(ListNode head) {

       return mergeSort(head);
        
    }
    
    
    ListNode merge(ListNode left, ListNode right) {
        
        if(left == null) return right;
        if(right == null) return left;
        
        ListNode ans = new ListNode();
        ListNode tempAns = ans;
        
        if(left.val < right.val) {
            tempAns.val = left.val;
            left = left.next;
        }
        else {
            tempAns.val = right.val;
            right = right.next;
        }
        
        
        
        while(left != null && right != null) {
                
            if(left.val < right.val) {
                
                ListNode temp = left;
                left = left.next;
                tempAns.next = temp;
                
            } 
            else {
                
                ListNode temp = right;
                right = right.next;
                tempAns.next = temp;
                
            }
            
            tempAns = tempAns.next;
        }
        
        if(left != null)  tempAns.next = left; 
        
        if(right != null) tempAns.next = right;
        
        return ans;
        
    }
    
    ListNode mergeSort(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode middle = findMiddle(head);
        
        ListNode secondHalf = middle.next;
        
        middle.next = null;
        
        ListNode left = mergeSort(head);
        
        ListNode right = mergeSort(secondHalf);
        
        return merge(left, right);
    }
    
    
    ListNode findMiddle(ListNode head) {
        
        if(head == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        if(fast == null) return prev;
        return slow;
    }
}