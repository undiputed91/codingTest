package org.example.programmers.level0.수조작하기2;

public class Solution {
    public String solution(int[] numLog){
        String answer = "";
        for(int i=0; i<numLog.length-1; i++){
            // 길이 설정시 i<numLog.length;로 설정하여 ArrayIndexOutOfBoundsException 발생
            if(numLog[i]+1 == numLog[i+1]){
                answer += "w";
            }else if(numLog[i]-1 == numLog[i+1]){
                answer += "s";
            }else if(numLog[i]+10 == numLog[i+1]){
                answer += "d";
            }else if(numLog[i]-10 == numLog[i+1]){
                answer += "a";
            }
        }
        return answer;
    }
}
