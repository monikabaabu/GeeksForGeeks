class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        reverse(st, top);
    }
    private static void reverse(Stack<Integer> st, int t){
        if(st.isEmpty()){
            st.push(t);
            return;
        }
        int top = st.pop();
        reverse(st,t);
        st.push(top);

    }
}
