class Solution {
    public boolean isBalanced(String num) {
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                evensum+=digit;
            }else{
                oddsum+=digit;
            }
        }
        return oddsum==evensum;
    }
}