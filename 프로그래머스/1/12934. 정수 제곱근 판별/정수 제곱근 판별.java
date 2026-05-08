class Solution {
    public long solution(long n) {
        long answer = 0;
        long n2=(long) Math.sqrt(n);
        
        if(n2*n2==n)
        {
            answer = (n2+1)*(n2+1);
        }
        else
        {
            answer = -1;
        }
        
        return answer;
    }
}