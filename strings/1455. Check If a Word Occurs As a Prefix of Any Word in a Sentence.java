class Solution {
    public boolean isStart(String wrd,String searchWord){
        if(wrd.length()<searchWord.length()){
            return false;
        }
        return searchWord.equals(wrd.substring(0,searchWord.length()));
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] wrds=sentence.split("\\s+");
        for(int i=0;i<wrds.length;i++){
            if(isStart(wrds[i],searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}