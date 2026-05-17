class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        
       String words[]=s.split(" ");
       if(words.length!=pattern.length()){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){

            if(map.containsKey(pattern.charAt(i))){
                String str=map.get(pattern.charAt(i));
                if(!str.equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }else{
                map.put(pattern.charAt(i),words[i]);
            }}
        }
        return true;
    }
}