class Solution {
    public int search(int[] nums, int target) {
        int res=0;
        int st=0,ed=nums.length;
        int mid=st+(ed-st)/2;
        if(nums[mid]==target)return mid;
        boolean left=false;
        if(nums[st]<=nums[mid]){
            left=true;
        }
        if(left&&nums[st]<=target&&target<=nums[mid]){
            for (int i = st; i <mid ; i++) {
                if(target==nums[i])return i;
            }
        }else if(left){
            for (int i = mid; i <ed ; i++) {
                if(target==nums[i])return i;
            }
        } else if (!left&&nums[mid]<target&&target<=nums[ed-1]) {
            for (int i = mid; i <ed ; i++) {
                if(target==nums[i])return i;
            }
        }else if(!left){
            for (int i = st; i <mid ; i++) {
                if(target==nums[i])return i;
            }
        }
        return -1;
    }
}
