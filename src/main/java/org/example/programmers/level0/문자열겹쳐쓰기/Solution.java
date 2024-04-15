package org.example.programmers.level0.문자열겹쳐쓰기;

import java.util.Arrays;

class Solution {

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        char[] overwriteArr = overwrite_string.toCharArray();
        int j = 0;
        for (int i = s; i < s+overwrite_string.length(); i++){  //int i가 s부터 시작하기에 범위에 s를 더해줘서 구해야함
            charArr[i] = overwriteArr[j];
            j++;
        }
        answer += String.copyValueOf(charArr);
        return answer;
    }

    //substring 사용풀class Solution {
    //    public String solution(String my_string, String overwrite_string, int s) {
    //        String before = my_string.substring(0, s);
    //        String after = my_string.substring(s + overwrite_string.length());
    //        return before + overwrite_string + after;
    //    }
    //}

    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_String = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String answer = solution.solution(my_String,overwrite_string,s);
        System.out.println(answer);
    }
}
