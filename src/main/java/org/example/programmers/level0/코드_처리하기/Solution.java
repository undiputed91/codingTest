package org.example.programmers.level0.코드_처리하기;

public class Solution {

    public String solution(String code) {
        int mode = 0;
        StringBuilder answer = new StringBuilder();
        char[] charArr = code.toCharArray();
        for (int i = 0; i<code.length(); i++){
            if (charArr[i] == '1') {
                if(mode == 0){
                    mode = 1;
                }else {
                    mode = 0;
                }
                continue;

            }
            if(mode == 0){
                if(i%2==0){
                    answer.append(charArr[i]);
                }
            }else{
                if(i%2!=0){
                    answer.append(charArr[i]);
                }
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String code = "10101010101";
        String answer = solution.solution(code);
        System.out.println(answer);
    }

}
