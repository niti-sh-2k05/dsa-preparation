Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.

A concatenated word is defined as a string that is comprised entirely of at least two shorter words (not necessarily distinct) in the given array.

 

Example 1:

Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
Example 2:

Input: words = ["cat","dog","catdog"]
Output: ["catdog"]


class Solution {
    public boolean isConcatenated(String s,Map<String,Boolean> map,Set<String> set){
        if(map.containsKey(s)){
            return map.get(s);
        }
        for(int i=0;i<s.length();i++){
            String prefix=s.substring(0,i+1);
            String suffix=s.substring(i+1,s.length());
            if(set.contains(prefix)&&set.contains(suffix)||set.contains(prefix)&&isConcatenated(suffix,map,set)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {

        List<String> res=new ArrayList<>();
        HashMap<String,Boolean> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        for(String wrd:words){
            set.add(wrd);
        }

        for(int i=0;i<words.length;i++){
            if(isConcatenated(words[i],map,set)){
                res.add(words[i]);
            }
        }
        return res;
    }
}