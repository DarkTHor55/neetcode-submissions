class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int st = i + 1;
            int ed = nums.length - 1;
            while (st < ed) {
                int sum = nums[i] + nums[st] + nums[ed];
                if (sum < 0) {
                    st++;
                } else if (sum > 0) {
                    ed--;
                } else {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[st]);
                    ls.add(nums[ed]);
                    res.add(ls);
                    st++;
                    ed--;
                    while (st < ed && nums[st] == nums[st - 1]) {
                        st++;
                    }
                    while (st < ed && nums[ed] == nums[ed + 1]) {
                        ed--;
                    }
                }
            }
        }
        return res;

    }
}
