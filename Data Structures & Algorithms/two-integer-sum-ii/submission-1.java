class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length - 1;
        int i = 0;
        int[] ans = new int[2];
        while ( i < n ){
            if (numbers[i]+numbers[n] == target){
                ans[0]= i +1;
                ans[1 ] = n +1;
                break;
            }
            if (numbers[i] + numbers[n] > target){
                n--;
            }
            if (numbers[i] + numbers[n] < target) {
                i++;
            }
        }
        return ans ;
    }
}
