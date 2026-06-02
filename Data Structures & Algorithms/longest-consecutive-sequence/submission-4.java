class Solution {
      public int longestConsecutive(int[] nums) {
         if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = Integer.MIN_VALUE;
        int res = 1;
        for (int i = 0; i < nums.length; i++) {

            int j = 1;
            while (set.contains(nums[i] + j)) {
                j++;
                res++;
            }
            ans = Math.max(ans, res);
            res = 1;

        }

        return ans;
    }
}
