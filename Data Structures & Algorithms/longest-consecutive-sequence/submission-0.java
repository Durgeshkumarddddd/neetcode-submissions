class Solution {
    public int longestConsecutive(int[] nums) {

        int longest = 0;

        for (int num : nums) {

            int current = num;
            int length = 1;

            while (contains(nums, current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }

    private boolean contains(int[] nums, int target) {
        for (int x : nums) {
            if (x == target)
                return true;
        }
        return false;
    }
}