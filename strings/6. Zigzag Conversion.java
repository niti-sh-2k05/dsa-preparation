class Solution {
    public String convert(String s, int numRows) {
        String result="";
        if(numRows==1){
            return s;
        }
        for(int i=0;i<numRows;i++){
            int j=i;int flag=1;
            while(j<s.length()){
                result+=s.charAt(j);

                if(i==0||i==numRows-1){
                    j+=(numRows-1)*2;
                }else if(flag%2!=0){
                    j+=(numRows-1)*2-(2*i);
                }else{
                    j+=2*i;
                }
                flag++;
            }
        }
        return result;
    }
}