class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;int maxFreq=0;int ans=0;
        int[] freq=new int[26];
        for(int right=0;right<answerKey.length();right++){
            freq[answerKey.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[answerKey.charAt(right)-'A']);

            if(right-left-maxFreq+1>k){
                freq[answerKey.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}