
import java.util.*;
class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst=new ArrayList<>();
        if(s.length()<p.length()){
            return lst;
        }

        int freq[]=new int[26];
        for(char ch:p.toCharArray()){
            freq[ch-'a']++;
        }

        int windowfreq[]=new int[26];
        int left=0;
        for(int right=0;right<s.length();right++){
            windowfreq[s.charAt(right)-'a']++;

            if(right-left+1>p.length()){
                windowfreq[s.charAt(left)-'a']--;
                left++;
            }

            if(Arrays.equals(windowfreq,freq)){
                lst.add(left);
            }
        }
        return lst;
    }
}