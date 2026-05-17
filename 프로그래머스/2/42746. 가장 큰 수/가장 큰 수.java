import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        // System.out.println(Arrays.toString(arr));
        
        String answer="";
        
        for(String s : arr){
            answer += s;
        }
        
        if(answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}