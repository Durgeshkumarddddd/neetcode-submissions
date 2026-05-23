class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                if (tokens[i].equals("+")){
                    st.push(Integer.toString((a + b)));
                }
                if (tokens[i].equals("-")){
                    st.push( String.valueOf((a - b))); // (a - b).toString() this is not work
                }
                if (tokens[i].equals("*")){
                    st.push(Integer.valueOf((a * b)).toString());
                }
                if (tokens[i].equals("/")){
                    st.push(""+(a / b));
                }
            }
            else {
                st.push(tokens[i]);
            }
        }
        int res = Integer.parseInt(st.pop());
        return res ;
    }
}
