class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];

        // Create a list that store position with time {position, time}
        // time = distance / speed = (target - position)/ speed

        for (int i = 0 ; i < n ; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i])/ speed[i] ;

        }
        // Now sort by descending order
        // Sort by using position means first column that why use a[0] means a row [0] index , as well for b;
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> st = new Stack<>();

        for (int i = 0 ; i < n ; i++){
            double time = cars[i][1];
            if(st.isEmpty() || time > st.peek()){
                st.push(time);
            }
        }
        return st.size();
     }
}
