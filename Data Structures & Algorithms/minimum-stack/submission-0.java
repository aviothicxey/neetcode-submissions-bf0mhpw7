class MinStack {
    class Pair{
        int val;
        int min;
        Pair(int val,int min){
            this.min = min;
            this.val = val;
        }
    }
    Stack<Pair> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
        }else{
            int minn = Math.min(val ,st.peek().min);
            st.push(new Pair(val,minn));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
