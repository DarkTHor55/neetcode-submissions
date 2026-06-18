class Solution {
   public int lengthOfLongestSubstring(String s) {
        int res;
        res= !s.isEmpty() ? 1:0;
        if (s.isEmpty())return 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character>set=new HashSet<>();
            set.add(s.charAt(i));
            for (int k=i+1;k<s.length();k++){
                if(set.contains(s.charAt(k))){
                    res=Math.max(res,set.size());
                    break;
                }else{
                    set.add(s.charAt(k));
                    res=Math.max(res,set.size());
                }
            }
        }
        return res;
    }
}
