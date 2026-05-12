class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(s.length()%2 != 0 && i == s.length() / 2 )
            {
                answer += c;
            }
            else if (s.length()%2 == 0)
            {
                if(i == s.length()/2-1 || i == s.length()/2)
                {
                    answer += c;
                }
            }
            
        }
        return answer;
    }
}