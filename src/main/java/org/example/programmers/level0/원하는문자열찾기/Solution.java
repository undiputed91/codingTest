package org.example.programmers.level0.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] charArr = myString.toCharArray();
        char[] patArr = pat.toCharArray();
        if(myString.length()>pat.length()){
            for(int i =0; i<charArr.length; i++){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
            for(int i =0; i<patArr.length; i++){
                patArr[i] = Character.toUpperCase(patArr[i]);
            }
            String myStr = new String(charArr);
            String patStr = new String(patArr);
            if(myStr.contains(patStr)){
                answer = 1;
            }
        }
        return answer;
    }
}
