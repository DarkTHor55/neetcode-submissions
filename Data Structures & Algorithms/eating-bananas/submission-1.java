class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int st=1,ed=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            ed=Math.max(ed,piles[i]);
        }
        int res=ed;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            long ans=0;
            for (int i = 0; i < piles.length; i++) {
                ans += (piles[i] + mid - 1) / mid;
            }
            if (ans > h) {
                st = mid + 1;
            } else {
                res = mid;
                ed = mid - 1;
            }
        }
        return res;
    }
}
