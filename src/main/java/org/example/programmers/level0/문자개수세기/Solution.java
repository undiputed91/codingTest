package org.example.programmers.level0.문자개수세기;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i =0; i< my_string.length(); i++){
            char alphabet = my_string.charAt(i);
            if(Character.isUpperCase(alphabet)){
                answer[alphabet-'A']++;
            }else{
                answer[alphabet-'a'+26]++;
            }
        }
        return answer;
    }
    //아스키 코드 상 소문자가 대문자 값의 +26

}
