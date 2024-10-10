package org.example.programmers.level0.글자이어붙여문자열만들기;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int i=0; i <index_list.length; i++){
            answer += charArray[index_list[i]];
        }
        return answer;
    }
}
