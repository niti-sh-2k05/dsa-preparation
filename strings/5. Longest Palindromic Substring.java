class Solution {
    static int isPalindrome(String str,int l,int r){
        
        while(l>=0&&r<str.length()&&str.charAt(l)==str.charAt(r)){
            l--;
            r++ ;
        }
        return r-l-1;
    }
    
    public String longestPalindrome(String s) {
        if(s.length()<=0) return "";
        else if(s.length()==1) return s;
        int st=0,e=0;
        for(int i=0;i<s.length();i++){
            int l1=isPalindrome(s,i,i);
            int l2=isPalindrome(s,i,i+1);

            int maxlen=Math.max(l1,l2);
            if(maxlen>e-st){
                st=i-(maxlen-1)/2;
                e=i+maxlen/2;
            }
           
        }
         return s.substring(st,e+1);
    }
}