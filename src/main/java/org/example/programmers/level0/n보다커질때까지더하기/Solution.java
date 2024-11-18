package org.example.programmers.level0.n보다커질때까지더하기;

public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i=0;
        while(i<numbers.length){
            answer += numbers[i];
            i++;
            if(answer>n){
                break;
            }
        }
        return answer;
    }

}
