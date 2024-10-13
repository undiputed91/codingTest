package org.example.programmers.level0.문자열여러번뒤집기;

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        String answer = "";
        for(int i = 0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];

            while(s<e){
                char temp = charArray[s];
                charArray[s] = charArray[e];
                charArray[e] = temp;
                s++;
                e--;
            }

            answer = new String(charArray);
            // charArray = {a,b,c,d};
            // sout(charArray) -> 주소값 나옴
            // sout(Arrays.toString()) -> {a,b,c,d}
            // sout(new String(charArray)) -> "abcd"
        }

        return answer;
    }
}

class Main{

    public static void main(String[] args) {
        String str = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        Solution sol = new Solution();
        String answer = sol.solution(str,queries);
        System.out.println(answer);
    }
}
