class Solution {
     public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);

        // 24/25
//         if(s.length()!=t.length())return false;
//      Map<Character,Integer>ls1=new HashMap<>();
//      Map<Character,Integer>ls2=new HashMap<>();
//      for (int i = 0; i < s.length(); i++) {
//        ls1.put(s.charAt(i), ls1.getOrDefault(s.charAt(i), 0) + 1);
//      }
//  for (int i = 0; i < t.length(); i++) {
//        ls2.put(t.charAt(i), ls2.getOrDefault(t.charAt(i), 0) + 1);     }
//         if(ls1.size()!=ls2.size())return false;

//      for (int i = 0; i < s.length(); i++) {
//         if(ls1.get(s.charAt(i))!=ls2.get(s.charAt(i))){
//             return false;
//         }
//      }
//      return  true;
    }
}
