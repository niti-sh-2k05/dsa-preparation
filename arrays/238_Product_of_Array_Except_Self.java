class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pleft=1;
        int pright=1;
        int[] ans=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            ans[i]=pleft;
            pleft=pleft*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i]*pright;
            pright=pright*nums[i];
        }
        return ans;
    }
}