class Solution {
    public char findTheDifference(String s, String t) {
        int asciS=0;
        int asciT=0;
        for(char ch:s.toCharArray()){
            asciS+=ch;
        }
        for(char ch:t.toCharArray()){
            asciT+=ch;
        }
        int c=asciT-asciS;
        char val=(char) c;
        return val;
    }
}