class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(word);
        
        while(sequence.contains(sb.toString())){
            count++;
            sb.append(word);
        }
        
        return count;
    }
}