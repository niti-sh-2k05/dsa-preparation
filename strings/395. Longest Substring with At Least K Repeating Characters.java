class Solution {
    static boolean isValid(int freq[],int k){
            for(int count:freq){
                if(count>0&&count<k){
                    return false;
                }
            }
            return true;
        }
    public int longestSubstring(String s, int k) {
        int res=0;
        
        for(int left=0;left<s.length();left++){
            int[] freq=new int[26];
            for(int right=left;right<s.length();right++){
                freq[s.charAt(right)-'a']++;

                if(isValid(freq,k)){
                    res=Math.max(res,right-left+1);
                }
            }
        }
        return res;
    }
}