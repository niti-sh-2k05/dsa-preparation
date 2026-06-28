class Solution {
    static boolean matches(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int freq[]=new int[26];
        int windowfreq[]=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        int left=0;
        for(int right=0;right<s2.length();right++){
            windowfreq[s2.charAt(right)-'a']++;

            if(right-left+1>s1.length()){
                windowfreq[s2.charAt(left)-'a']--;
                left++;
            }

            if(matches(freq,windowfreq)){
                return true;
            }
        }
        return false;
    }
}