class Solution {

    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        sortStack(st);
        insertSorted(st, top);
    }

    private static void insertSorted(Stack<Integer> st, int element) {
        if (st.isEmpty() || st.peek() <= element) {
            st.push(element);
            return;
        }

        int top = st.pop();
        insertSorted(st, element);
        st.push(top);
    }
}
