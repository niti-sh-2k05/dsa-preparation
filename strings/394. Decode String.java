class Solution {
    public String decodeString(String s) {
        Stack<Integer> numst=new Stack<>();
        Stack<StringBuilder> strst=new Stack<>();
        int num=0;
        StringBuilder ans=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=(num*10)+ch-'0';
            }
            else if(ch=='['){
                numst.push(num);
                num=0;
                strst.push(ans);
                ans=new StringBuilder();
            }else if(ch==']'){
                int repeat=numst.pop();
                StringBuilder temp=new StringBuilder();
                for(int i=0;i<repeat;i++){
                    temp.append(ans);
                }
                ans=strst.pop();
                ans.append(temp);
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}