class Solution {
    public boolean isPalindrome(String s, int l, int r){
        while(l <= r ){
            if (s.charAt(l) != s.charAt(r)){
                return false ;
            }
            l++;
            r-- ;
        }
        return true ;
    }
    public boolean validPalindrome(String s) {
        if (isPalindrome(s, 0, s.length()-1)){
            return true ;
        }
        int l = 0 , r = s.length() - 1 ;

        while (l <= r ){
            if (s.charAt(l) != s.charAt(r)){
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true ;
    }
}