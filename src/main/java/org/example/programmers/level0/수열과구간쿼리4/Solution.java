package org.example.programmers.level0.수열과구간쿼리4;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j = s; j<= e; j++){
                if(j%k == 0){ //arr[j]%k가 아니다 문제 잘 읽자
                    arr[j] +=1;
                }
            }
        }
        return arr;
    }
}

class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        int[] answer = sol.solution(arr,queries);

        System.out.println(Arrays.toString(answer));
    }
}
