class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;//the sum of digits will lead to 9 -27->2+7=9
        }else{
            return num%9;    //the sum will be the rem of 9 16->1+6=7
                }
    }
}