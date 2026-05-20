class Solution {
    public int vowelStrings(String[] words, int left, int right) {
            int count=0;
        for(int i=left;i<=right;i++){
            String wrd=words[i];
            char start=wrd.charAt(0);
            char end=wrd.charAt(wrd.length()-1);
        
            if(start=='a'||start=='e'||start=='i'||start=='o'||start=='u'){
                if(end=='a'||end=='e'||end=='i'||end=='o'||end=='u'){
                    count++;
            }}
        }
        return count;
    }
}