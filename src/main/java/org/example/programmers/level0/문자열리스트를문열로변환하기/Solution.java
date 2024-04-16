package org.example.programmers.level0.문자열리스트를문열로변환하기;

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(String alphabet : arr){
            answer += alphabet;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"a","b","c"};
        String answer = solution.solution(arr);
        System.out.println(answer);
    }
}
