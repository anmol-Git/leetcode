class Solution {
    private Set<String> dict;
    private String beginWord;
    private String endWord;
    
    private Map<String, List<String>> parentsMap = new HashMap<>();
    private List<List<String>> paths = new ArrayList<>();
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        this.dict = new HashSet(wordList);
        dict.add(beginWord);
        
        if (!dict.contains(endWord)) return paths;
        this.beginWord = beginWord;
        this.endWord = endWord;
        
        if (!buildMap()) return paths;
  
        List<String> curr = new ArrayList<>();
        curr.add(beginWord);
        
        collectAllPaths(beginWord, curr);
        
        return paths;
    }
    
    private void collectAllPaths(String s, List<String> curr) {
        if (s.equals(endWord)) {
            paths.add(new ArrayList(curr));
            return;
        }
        
        for (String next : parentsMap.get(s)) {
            curr.add(next);
            collectAllPaths(next, curr);
            curr.remove(curr.size() - 1);
        }
    }
    
 
    private boolean buildMap() {
        Set<String> backward = new HashSet<>();
        backward.add(endWord);
        
        Set<String> visited = new HashSet<>();
        boolean found = false;
        
        while (!backward.isEmpty() && !found) {
            Set<String> temp = new HashSet<>();
            
            for (String s : backward) {
                visited.add(s);
   
                for (String nb : getNext(s)) {
                    
                    if (backward.contains(nb) || visited.contains(nb)) continue;
                    if (beginWord.equals(nb)) found = true;

                    temp.add(nb);
                    parentsMap.putIfAbsent(nb, new ArrayList<>());
                    parentsMap.get(nb).add(s);
                }
            }
            backward = temp;
        }
        return found;
    }
    
    private List<String> getNext(String s) {
        char[] arr = s.toCharArray();
        List<String> nbs = new ArrayList<>();
   
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == ch) continue;
                arr[i] = c;
                String nb = new String(arr);
                if (dict.contains(nb)) nbs.add(nb);
            }
            arr[i] = ch;
        }
        
        return nbs;
    }
}