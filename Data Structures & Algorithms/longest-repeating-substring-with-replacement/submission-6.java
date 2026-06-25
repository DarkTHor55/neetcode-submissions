class Solution {
       public int characterReplacement(String s, int k) {
        int count =0;
        int freq=0;
        int left=0;
        int arr[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            arr[s.charAt(i)-'A']++;
            freq=Math.max(freq,arr[s.charAt(i)-'A']);
            int len=i-left+1;
            if(len-freq>k){
                arr[s.charAt(left)-'A']--;
                left++;

            }
            len=i-left+1;
            count=Math.max(len,count);
        }
        return count;
    }
}
