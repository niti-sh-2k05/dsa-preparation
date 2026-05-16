class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){

            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }else{

            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;}
        }
        return new String(ch);
    }
}