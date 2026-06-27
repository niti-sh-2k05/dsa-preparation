import java.util.*;

class Solution{
    public static void main(String[] args) {
        
int ar[]={5,6,4,3,4,3,2};

HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<ar.length;i++){
    if(map.containsKey(ar[i])){
        map.put(ar[i],map.get(ar[i])+1);
    }else{
        map.put(ar[i],1);
    }
}

for(Map.Entry entry:map.entrySet()){
    System.out.println(entry.getKey()+entry.getValue());
}}}