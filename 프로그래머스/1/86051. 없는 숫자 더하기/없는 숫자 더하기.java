class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] n = new int[10];
        for(int i=0; i<10; i++)
        {
            n[i] = i;
        }
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(numbers[i]==j)
                {
                    n[j] = 0;
                }
            }
        }
        
        for(int i=0; i<10; i++)
        {
            answer += n[i];
        }
        return answer;
    }
}