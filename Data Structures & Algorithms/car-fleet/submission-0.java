class Solution {
    class Car{
        int position;
        double timeForTarget;
        Car(int position,double timeForTarget){
            this.position=position;
            this.timeForTarget=timeForTarget;
        }
    }
        public int carFleet(int target, int[] position, int[] speed) {
        int ans=0;
        Car[] cars=new Car[position.length];
        for (int i=0; i<position.length;i++){
            cars[i]=new Car(position[i],(double)(target-position[i])*1/speed[i]);
        }
        Arrays.sort(cars,new Comparator<Car>(){
            @Override
            public int compare(Car a, Car b) {
                return a.position-b.position;
            }
        });
        for (int i = position.length-1; i >=1 ; i--) {
           if(cars[i-1].timeForTarget <= cars[i].timeForTarget){
                cars[i-1]=cars[i];
            }else{
                ans++;
            }
        }
        return ans+1;

    }
}
