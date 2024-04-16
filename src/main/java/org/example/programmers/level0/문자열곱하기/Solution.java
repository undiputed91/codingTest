package org.example.programmers.level0.문자열곱하기;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int i = 0;
        while(i != k){
            answer += my_string;
            ++i;
        }  //String.repeat(k) 로 k 횟수 만큼 붙일 수 있다.
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "string";
        int k = 3;
        String answer = solution.solution(my_string,k);
        System.out.println(answer);
    }
}