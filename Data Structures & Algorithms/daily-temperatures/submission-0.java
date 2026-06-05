class Solution {
       public int[] dailyTemperatures(int[] temperatures) {
        int [] res=new int[temperatures.length];
        for (int i=0;i<temperatures.length;i++){
            int days=0,ed=temperatures.length-1;
            int st=i+1;
            while (st<=ed){
                days++;

                if(temperatures[i]<temperatures[st]){
                    res[i]=days;
                    days=0;

                    break;
                }
                st++;
            }

        }
        return res;

    }

}
