package org.example.programmers.level0.세로읽기;

public class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int piece = my_string.length()/m;
        for(int i=0; i<piece; i++){
            String strPart = my_string.substring(i*m,(1+i)*m);
            char charPart = strPart.charAt(c-1);
            answer += charPart;
        }
        return answer;
    }

}
