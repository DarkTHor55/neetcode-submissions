class Solution {
     public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i <tokens.length ; i++) {
            if(tokens[i].equals("+")){
                int val=stack.pop();
                int val2=stack.pop();
                    val+=val2;
                stack.push(val);
            }else if(tokens[i].equals("-")) {
                int val = stack.pop();
                int val2=stack.pop();
                val = val2-val;
                stack.push(val);
            }else if(tokens[i].equals("*")) {
                int val = stack.pop();
                int val2=stack.pop();
                val*=val2;
                stack.push(val);
            }else if(tokens[i].equals("/")) {
                int val =stack.pop();
                int val2=stack.pop();
                if(val!=0){
                    val2 /= val;
                }
                stack.push(val2);
              
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
