class Solution {

    boolean solve(int i,
                  String s,
                  List<String> wordDict,
                  int[] dp){

        if(i == s.length())
            return true;

        if(dp[i] != -1)
            return dp[i] == 1;

        for(String word : wordDict){

            if(s.startsWith(word,i)){

                if(solve(i + word.length(),
                         s,
                         wordDict,
                         dp)){

                    dp[i] = 1;
                    return true;
                }
            }
        }

        dp[i] = 0;
        return false;
    }

    public boolean wordBreak(String s,
                             List<String> wordDict) {

        int[] dp = new int[s.length()];

        Arrays.fill(dp,-1);

        return solve(0,s,wordDict,dp);
    }
}