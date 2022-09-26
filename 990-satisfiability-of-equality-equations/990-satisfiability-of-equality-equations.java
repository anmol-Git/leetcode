class Solution {
    
    private static int[] parent;
    private static int[] rank;
    
    public boolean equationsPossible(String[] equations) {
        
        int n = equations.length;
        
        parent = new int[26];
        rank = new int[26];
        
        for(int i = 0; i < 26; i++) parent[i] = i;
        
        for(String s : equations) {
            
            if(s.charAt(1) == '=') {
                
                parent[find(s.charAt(0)- 'a')] = find(s.charAt(3) - 'a');
            }   
        }
        
        
        for(String s : equations) {
            
            if(s.charAt(1) == '!') {
                
                if(find(s.charAt(0) - 'a') == find(s.charAt(3) - 'a')) return false;
                
            }
            
        }
        
        return true;
        
    }
    
    public static int find(int x) {
        if (parent[x] == x) return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public static void union(int a, int b) {
        int x = find(a);
        int y = find(b);

        if(x == y) return;

        if (rank[x] < rank[y]) {
            parent[x] = y;
        }
        else if(rank[x] > rank[y]) {
            parent[y] = x;
        }
        else {
            parent[y] = x;
            rank[x]++;
        }
    }
}