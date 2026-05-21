import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int a=0,b=0,c=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==s1[i%5]){
                a++;
            }
            if(answers[i]==s2[i%8]){
                b++;
            }
            if(answers[i]==s3[i%10]){
                c++;
            }
        }
        Queue<Integer> que = new LinkedList<Integer>();
        int max = Math.max(Math.max(a,b),c);
        if(max==a){
            que.add(1);
        }
        if(max==b){
            que.add(2);
        }
        if(max==c){
            que.add(3);
        }
        // que 크기만큼 배열 생성 
        int[] answer = new int[que.size()];
        for(int i=0; i<answer.length; i++){
            // 큐의 맨 앞 데이터 꺼내기 
            answer[i] = que.poll();
        }
        return answer;
    }
}