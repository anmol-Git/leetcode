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
        ListNode cur,prev;
        if(head==null || head.next==null){
            return head;
        }
        cur=head.next;
        prev=head;
       
        while(cur!=null){ boolean isMc=true;
            if(prev.val==cur.val){
                if(cur.next==null){
                    prev.next=null;
                    isMc=false;
                }
                else{
                    if(prev.val==cur.next.val){isMc = false;}
                }
                prev.next=cur.next;
            }
            if(!isMc){cur=cur.next;}
            else {
                prev=cur;
                cur=cur.next;
            }
        }
        return head;
        
    }
    
}