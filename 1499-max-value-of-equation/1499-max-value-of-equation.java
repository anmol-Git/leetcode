class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        Deque<Integer> dq = new LinkedList<>();
        
       for(int i =0;i<points.length;i++){
           
           while(!dq.isEmpty() && points[i][0] - points[dq.peek()][0] >k) dq.poll();
           
           if(!dq.isEmpty()){
            max = Math.max(max,points[i][1] + points[i][0] + points[dq.peek()][1] - points[dq.peek()][0]);
           }
           
         while(!dq.isEmpty() && points[dq.peekLast()][1] - points[dq.peekLast()][0] < points[i][1] - points[i][0])
         dq.pollLast();
           
           dq.addLast(i);
       }
        
        return max;
    }
}