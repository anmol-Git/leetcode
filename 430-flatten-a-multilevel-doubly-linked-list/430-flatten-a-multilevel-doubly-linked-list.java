/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        flat(head);
        return head;
        
    }
    
    Node flat(Node head){
        if(head == null) return head;
        
        Node temp = head;
        
        if(temp.child != null) {
            
            Node next = temp.next;
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child = null;
            Node iterate = temp;
            
            while(iterate.next != null) {
                iterate = iterate.next;
                
            }
            iterate.next = next;
           if(next != null) next.prev = iterate;
            
        } 
        
        return flat(temp.next);
    }
}