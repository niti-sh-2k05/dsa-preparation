class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int freq[]=new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-'a']++;
        }
         for(char ch:ransomNote.toCharArray()){
            freq[ch-'a']--;
        }
        for(int num:freq){
            if(num<0){
                return false;
            }
        }
        return true;









        // HashSet<Character> set=new HashSet<>();
        // for(int i=0;i<magazine.length();i++){
        //     set.add(magazine.charAt(i));
        // }
        // for(int i=0;i<ransomNote.length();i++){
        //      if(set.contains(ransomNote.charAt(i))){
        //         set.remove(ransomNote.charAt(i));
        //     }
        //     else if(!set.contains(ransomNote.charAt(i))){
        //         return false;
        //     }
        // }
        // return true;
    }
}