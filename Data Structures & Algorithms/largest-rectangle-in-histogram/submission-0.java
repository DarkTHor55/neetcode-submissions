class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>pStack=new Stack<>();
        Stack<Integer>nStack=new Stack<>();
        int[]pArr=new int[heights.length];
        int[]nArr=new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while(!pStack.isEmpty() && heights[pStack.peek()] >= heights[i]){
                    pStack.pop();
            }
            if(pStack.isEmpty()){
                pArr[i]=-1;
            }else{
                pArr[i]=pStack.peek();

            }
            pStack.push(i);

        }
        for (int i = heights.length-1;i>=0; i--) {
            while(!nStack.isEmpty() && heights[nStack.peek()] >= heights[i]){
                    nStack.pop();
               
            }
            if(nStack.isEmpty()){
                nArr[i]=heights.length;
            }else{
                nArr[i]=nStack.peek();
            }
            nStack.push(i);
        }
        int ans=0;
        for (int i = 0; i <pArr.length ; i++) {
            int width = nArr[i] - pArr[i] - 1;

            int area = heights[i] * width;
            ans=Math.max(area,ans);
        }
        return ans;
    }
}
