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
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode head = new ListNode();
        ListNode temphead = head;
        if(list1.val < list2.val) {
            
            temphead.val = list1.val;
            list1 = list1.next;
        
        }else {
            
            temphead.val = list2.val;
            list2 = list2.next;
        
        }
        
        while(list1 != null && list2 != null) {
              
            ListNode temp = new ListNode();
            
            if(list1.val < list2.val) {
                
                temp.val = list1.val;
                list1 = list1.next;
            }
            else {
                temp.val = list2.val;
                list2 = list2.next;
            }
            
            temphead.next = temp;
            temphead = temphead.next;
            
        }
        
        if(list1 != null) {
            temphead.next = list1;
        }
        
        if(list2 != null) {
            temphead.next = list2;
        }
        
        return head;
    }
}