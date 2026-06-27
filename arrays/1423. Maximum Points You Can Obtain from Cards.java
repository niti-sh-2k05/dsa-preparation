class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int val:cardPoints){
            total+=val;
        }
        int windowSize=cardPoints.length-k;
        if(windowSize==0){
            return total;
        }
        int windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=cardPoints[i];
        }
        int minsum=windowSum;
        for(int i=windowSize;i<cardPoints.length;i++){
            windowSum+=cardPoints[i]-cardPoints[i-windowSize];
            minsum=Math.min(minsum,windowSum);
    }
    return total-minsum;
}}