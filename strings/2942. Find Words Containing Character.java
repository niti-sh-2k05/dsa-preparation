class Solution {
    public boolean isValid(String wrd,char x){
        for(char ch:wrd.toCharArray()){
            if(ch==x){
                return true;
            }
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isValid(words[i],x)){
                res.add(i);
            }
        }
        return res;
    }
}