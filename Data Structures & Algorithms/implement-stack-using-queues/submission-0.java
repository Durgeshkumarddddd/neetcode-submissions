class MyStack {

    Queue<Integer> q1 ;
    Queue<Integer> q2 ;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        if (q1.isEmpty()){
            q1.offer(x);
            return ;
        }
        while(!q1.isEmpty()){
          int val =  q1.poll();
          q2.offer(val);
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            int val = q2.poll();
            q1.offer(val);
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */