class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);    
    }
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
    int[] result = new int[k];
    int idx=0;
    for(Map.Entry<Integer, Integer> val : list){
       if(idx==k)break;
       result[idx++]=val.getKey();
    }
    return result;

}
}
