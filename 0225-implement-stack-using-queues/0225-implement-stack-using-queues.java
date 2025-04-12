class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
          for(int i=1; i<q.size(); i++){
              q.offer(q.peek());
              q.poll();
          }
    }

    public int pop() {
        int top = q.peek();
         q.poll();
         return top;
    }

    public int top() {
          return q.peek();
    }

    public boolean empty() {
        if(!q.isEmpty()) return false;
        return true;
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