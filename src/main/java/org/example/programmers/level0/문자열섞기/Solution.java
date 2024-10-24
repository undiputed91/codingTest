package org.example.programmers.level0.문자열섞기;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        for (int i = 0; i<str1.length(); i++){
            String strPart1 = String.valueOf(charArr1[i]);
            String strPart2 = String.valueOf(charArr2[i]);
            answer += strPart1;
            answer += strPart2;
        }
        return answer;
    }

    //String -> 문자배열 char[] charArr = str.toCharArray();
    //문자 하나 뽑기 char char1 = str.charAt(i);
    //char[] -> String  : String str = String.valueOf();       String str = new String(charArr); 비추
    //String str = String.copyValueOf(반환데이터,시작인덱스,변환할 길이)

    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        Solution solution = new Solution();
        String answer = solution.solution(str1,str2);
        System.out.println(answer);
    }
}


