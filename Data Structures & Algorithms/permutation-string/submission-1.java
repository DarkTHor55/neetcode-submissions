class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j <= s2.length()-s1.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                   if(per(s1,s2.substring(j,j+s1.length()))){
                       return true;
                   }
                }
            }
        }
        return false;
    }
    public boolean per(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else {
                map.put(s1.charAt(i),1);
            }
        }
        HashMap<Character,Integer>map2=new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            }else {
                map2.put(s2.charAt(i),1);
            }

        }
        for (Character ch:map.keySet()) {
            if(!map.get(ch).equals(map2.get(ch))){
                return false;
            }
        }
        return true;
    }
}
