class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < tokens.length){
            if(isToken(tokens[i])){
                int b = st.pop();
                int a = st.pop();
                if(tokens[i].equals("+")){
                    st.push(a+b);
                }else if(tokens[i].equals("-")){
                    st.push(a-b);
                }else if(tokens[i].equals("/")){
                    st.push(a/b);
                }else{
                    st.push(a*b);
                }
                i++;
            }else{
                st.push(Integer.parseInt(tokens[i]));
                i++;
            }
            
        }
        return st.pop();
    }
    public boolean isToken(String token){
        if(token.equals("+") || token.equals("-") ||token.equals("*") || token.equals("/") ){
            return true;
        }
        return false;
    }
}
