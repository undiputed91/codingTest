package org.example.programmers.level0.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStr = myString.toUpperCase();
        String patStr = pat.toUpperCase();
        answer = myStr.contains(patStr)? 1 : 0;
        return answer;
    }
}

// Character.toUpperCase()만 있는게 아니라 String.toUpperCase()도 존재
