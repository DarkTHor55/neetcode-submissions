class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
        char[] ch = strs[i].toCharArray();
        Arrays.sort(ch);
        String sortedStr = new String(ch);
        if (!map.containsKey(sortedStr)) {
            map.put(sortedStr, new ArrayList<>());
        }
        map.get(sortedStr).add(strs[i]);
    }
    return new ArrayList<>(map.values());    
 }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>>res=new ArrayList<>();
//         boolean[] arr = new boolean[strs.length];
//         for(int i=0;i<strs.length;i++){
//             if(!arr[i]){
//                 List<String>subRes=new ArrayList();
//                 subRes.add(strs[i]);
//                 for(int j=i+1;j<strs.length;j++){
//                     if(!arr[j]){
//                         boolean curr=isAnagram(strs[i],strs[j]);
//                         if(curr){
//                             subRes.add(strs[j]);
//                             arr[j]=true;
//                         }
//                     }

//                 }
//                 arr[i]=true;
//                 res.add(subRes);
//             }
//         }
//         return res;        
//     }
//    public boolean isAnagram(String s, String t) {

//     if (s.length() != t.length()) {
//         return false;
//     }
//     char[] charS = s.toCharArray();
//     char[] charT = t.toCharArray();
//     Arrays.sort(charS);
//     Arrays.sort(charT);
//     return Arrays.equals(charS, charT);
// }
}
