class MinStack {
    Stack<Long> st;
    long min = 0;

    public MinStack() {
        st = new Stack<>();

    }

    public void push(int val) {
        long value = val;
        if(st.isEmpty()){
            st.push(value);
            min = value;
        }
        else{
            if(value > min) st.push(value);
            else{
                st.push((2*value)-min);
                min = value;
            }
        }
    }

    public void pop() {
        if(!st.isEmpty()){
        long x = st.peek();
        st.pop();

        if(x < min){
            min = (2*min) - x;
        }
        }   
    }

    public int top() {
        if(st.isEmpty()) return -1;

        long topp = st.peek();
        if(topp<min) return (int)min;
        return (int)topp;
    }

    public int getMin() {
       return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */