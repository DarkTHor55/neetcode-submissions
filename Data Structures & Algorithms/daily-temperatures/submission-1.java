class Solution {
       class Pair{
        int key;
        int val;
        Pair(int key, int val){
            this.key=key;
            this.val=val;
        }
    }
       public int[] dailyTemperatures(int[] temperatures) {
        int [] res=new int[temperatures.length];
        Stack<Pair>stack=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if(!stack.isEmpty()) {
                while (!stack.isEmpty()&&stack.peek().val < temperatures[i]) {
                    res[stack.peek().key]=i-stack.peek().key;
                    stack.pop();
                }

            }
            stack.push(new Pair(i,temperatures[i]));
        }
        return res;
    }

}
