class Solution {
     public int maxProfit(int[] prices) {
        List<Integer>list=new ArrayList<>();
        int st=0,ed=prices.length-1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j <prices.length ; j++) {
                if(prices[i]<prices[j]){
                    list.add(prices[j]-prices[i]);
                }
            }
        }
        int ans=0;
        for(Integer i:list){
            ans=Math.max(ans,i);
        }
        return ans;
    }
}
