class Solution {

   public String encode(List<String> strs) {
    String str="";
        for(int i=0;i<strs.size();i++){
            str+="~";
            str+=strs.get(i);
        }
        return str;
    }

     public List<String> decode(String str) {
        if(str.length() >0){
        List<String>list=List.of(str.substring(1).split("~",-1));
            return list;
        }
        return List.of();
        
    }
   
}
