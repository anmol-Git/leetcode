class Solution {
    public boolean arrayStringsAreEqual(String[] a, String[] b) {
        
        StringBuilder sa = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<a.length;i++){
            sa.append(a[i]);
            
        }
        
        for(int i =0;i<b.length;i++){
            sb.append(b[i]);
            
        }
        
        if(sa.toString().equals(sb.toString())) return true;
        else return false;
    }
}