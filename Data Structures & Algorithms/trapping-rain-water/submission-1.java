class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        // creating the left arr 
        left[0] = height[0];
        for (int i = 1 ; i < left.length; i++){
            if (height[i] > left[i - 1]){
                left[i] = height[i];
            }
            else {
                left[i] = left[i - 1];
            }
        }
        // for creating the right arr
        right[right.length - 1] = height[height.length - 1];
        for (int i = height.length - 2 ; i >=0 ;i-- ){
            if (height[i] > right[i+1]){
                right[i] = height[i];
            }else{
                right[i] = right[i + 1] ;
            }
        }
        // Now find the min from each index - height ;
        int total = 0 ;
        for (int i = 0 ;i < height.length ;i++){
            total += Math.min(left[i], right[i] ) - height[i];
        }

        return total;
    }
}
