class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)return true;
        if(s.length()==1)return false;

        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<s.length();i++){
            Character curr=s.charAt(i);
            if(curr.equals(')')&&!stack.isEmpty()&&stack.peek().equals('(')){
                stack.pop();
            }else if(curr.equals('}')&&!stack.isEmpty()&&stack.peek().equals('{')){
                stack.pop();
            }else if(curr.equals(']')&&!stack.isEmpty()&&stack.peek().equals('[')){
                stack.pop();
            }else{
                stack.push(curr);
            }
        }
        return stack.size()==0;
    }
}
