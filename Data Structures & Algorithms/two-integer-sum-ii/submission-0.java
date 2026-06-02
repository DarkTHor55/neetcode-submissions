class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        boolean get=false;
        int idx1=0;
        int idx2=0;
        int nxt=0;
        for (int i = 0; i < numbers.length; i++) {
            int res=target-numbers[i];
            if(set.contains(res)){
                if(numbers[i]<res){
                    idx1=i;
                    get=true;
                    idx2=res;
                    nxt=res;
                    break;
                }else{
                    idx2=i;
                    get=false;
                    idx1=res;
                    nxt=res;
                    break;
                }

            }
        }
        if(get){
            for (int i = 0; i < numbers.length; i++) {
                if (nxt == numbers[i]) {
                    idx2 = i;
                }
            }
        }else{
            for (int i = 0; i < numbers.length; i++) {
                if (nxt==numbers[i]){
                    idx1=i;
                }
            }
        }
        return new int[]{idx1+1,idx2+1};

    }
}
