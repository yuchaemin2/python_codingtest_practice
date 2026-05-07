import java.util.*;
class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] charArr = s.toCharArray(); 
        Arrays.sort(charArr); 
        
        StringBuilder sb = new StringBuilder(new String(charArr));
        sb.reverse();


        return Long.parseLong(sb.toString());
    }
}