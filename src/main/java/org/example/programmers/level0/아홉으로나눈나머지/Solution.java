package org.example.programmers.level0.아홉으로나눈나머지;

public class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] charArray = number.toCharArray();
        for(char num : charArray){
            answer += Character.getNumericValue(num);
            //char -> int Character.getNumericValue();
            //int -> char +'';
        }
        answer = answer%9;
        return answer;
    }

}
