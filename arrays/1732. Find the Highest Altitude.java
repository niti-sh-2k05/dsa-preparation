class Solution {
    public int largestAltitude(int[] gain) {
        int maax=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            maax=Math.max(maax,sum);
        }

        return (maax<0)?0:maax;
    }
}