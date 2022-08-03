class MyCalendar {
    
    List<Pair> list;
    
    public MyCalendar() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        if(list.size() == 0) {
            list.add(new Pair(start, end));
            return true;
        }
        
        for(int i = 0; i < list.size(); i++) {
            
            Pair curr = list.get(i);
            
            if(Math.max(curr.start, start) < Math.min(curr.end, end)) return false;
        }
        
        list.add(new Pair(start, end));
        
        return true;
    }
    
 class Pair {
    
     int start;
     int end;
     
     Pair(int start, int end) {
         
         this.start = start;
         this.end = end;
         
     }
     
 }    

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */