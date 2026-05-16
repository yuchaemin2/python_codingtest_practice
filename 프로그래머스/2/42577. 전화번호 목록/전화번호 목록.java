import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap <String, Integer> map = new HashMap<>();
        for(String p : phone_book){
            map.put(p,1);
        }
        
        for(String p : phone_book){
            for(int i=1; i<p.length(); i++){
                String prefix = p.substring(0,i);
                
                if(map.containsKey(prefix)){
                    return false;
                }
            }
        }
        return true;
    }
}