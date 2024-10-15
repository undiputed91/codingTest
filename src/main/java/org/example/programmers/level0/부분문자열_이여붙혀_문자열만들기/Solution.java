package org.example.programmers.level0.부분문자열_이여붙혀_문자열만들기;

public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i =0;i<parts.length; i++){
            int s = parts[i][0];
            int e = parts[i][1];

            String strPart = my_strings[i].substring(s,e+1);
            answer += strPart;
        }
        return answer;
    }

}
