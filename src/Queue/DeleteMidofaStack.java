class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here

        int c = s.size()/2 ;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<c;i++){
            stack.push(s.pop());
        }
        s.pop();
        while(!stack.isEmpty()){
            s.push(stack.pop());
        }

    }
}