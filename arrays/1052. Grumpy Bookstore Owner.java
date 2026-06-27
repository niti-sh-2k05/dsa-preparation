class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int initial=0;int current=0;int maxsat=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                initial+=customers[i];
            }else if(i<minutes){
                current+=customers[i];
            }
        }
        maxsat=current;
        for(int i=minutes;i<customers.length;i++){
            current+=customers[i]*grumpy[i];
            current-=customers[i-minutes]*grumpy[i-minutes];
            maxsat=Math.max(current,maxsat);
        }
         return maxsat+initial;
    }
   
}