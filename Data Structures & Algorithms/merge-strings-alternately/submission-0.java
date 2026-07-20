class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length() ;
        int i = 0, j= 0;
        String mergeStr = "";
        while(i < m && j < n){
            mergeStr += word1.charAt(i);
            mergeStr += word2.charAt(j);
            i++;
            j++;
        }
        while(i < m){
            mergeStr += word1.charAt(i);
            i++;
        }
        while(j < n){
            mergeStr += word2.charAt(j);
            j++;
        }
        return mergeStr ;
    }
}