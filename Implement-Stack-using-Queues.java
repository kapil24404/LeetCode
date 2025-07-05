class MyStack {

    public MyStack() {
        
    }
    Queue<Integer> q=new LinkedList<>();
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
       for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
        int ans=q.poll();
        return ans;
    }
    
    public int top() {
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
        int top = q.poll();   
        q.add(top);        
    return top;
    }
    
    public boolean empty() {
        if(q.isEmpty()) return true;
        else return false;
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