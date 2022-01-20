class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        for(int i =0;i<s.length();i++){
            
            if(s.charAt(i) == '0'){
                
                while(!q.isEmpty() && q.peek() + maxJump < i) q.poll();
                
                if(q.isEmpty()) return false;
                
                if(q.peek() + minJump <= i && q.peek() + maxJump >= i){
                    q.add(i);
                    if(i == s.length() -1) return true;
                }
            }
        }
        return false;
    }
}