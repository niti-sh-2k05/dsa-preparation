class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
            char prev='#';
        while(ans.length()<s.length()){
            char selected='#';
            int maxFreq=0;
            for(char ch:map.keySet()){
                if(ch!=prev&&map.get(ch)>maxFreq){
                    selected=ch;
                    maxFreq=map.get(ch);
                }
            }

            if(selected=='#'){
                return "";
            }

            ans.append(selected);
            map.put(selected,map.get(selected)-1);
            if(map.get(selected)==0){
                map.remove(selected);
            }
            prev=selected;
        }
        return ans.toString();
    }
}