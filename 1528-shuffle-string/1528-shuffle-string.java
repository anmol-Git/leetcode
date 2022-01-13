class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i = 0;i<indices.length;i++){
            char curr = s.charAt(i);
            sb.deleteCharAt(indices[i]);
            sb.insert(indices[i],curr);
        }
        return sb.toString();
    }
}