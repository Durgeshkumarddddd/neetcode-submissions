class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 ; 
        int maxSubString = 0 ;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++){
           while (charSet.contains(s.charAt(i))){
            charSet.remove(s.charAt(l));
            l++ ;
           }
           charSet.add(s.charAt(i));
           maxSubString = Math.max(maxSubString, i - l +1);
        }
        return maxSubString ;
    }
}
