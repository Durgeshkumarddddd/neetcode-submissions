class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int r = people.length - 1, l = 0 ;
        int count = 0 ;
        Arrays.sort(people);

        while ( l <= r ){
            while ( people[r] >= limit  && l < r){
                count++;
                r--;
            }
            if (l == r ){
                count++;
                break;
            }
            if (people[l] + people[r] > limit ){
                count++;
                r--;
            }
            if (people[l] + people[r] <= limit ){
                count++;
                l++;
                r--;
            }
        }
        return count ;
    }
}