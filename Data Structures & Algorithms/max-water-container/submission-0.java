class Solution {
   public int maxArea(int[] heights) {
        List<Integer>ls=new ArrayList<>();
        int st=0,ed=heights.length-1;
        while (st<ed){
            int l=ed-st;
            int w=-1;
            if(heights[st]<heights[ed]){
                w=heights[st];
                st++;
            }else{
                w=heights[ed];
                ed--;
            }
            ls.add(l*w);
        }
        st=Integer.MIN_VALUE;
        for (int i = 0; i < ls.size(); i++) {
            st=Math.max(st,ls.get(i));
        }
        return st;

    }
}
