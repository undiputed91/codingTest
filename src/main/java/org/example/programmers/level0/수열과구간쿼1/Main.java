package org.example.programmers.level0.수열과구간쿼1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1},{1, 2},{2, 3}};
        int [] answer = sol.solution(arr,queries);
        System.out.println(Arrays.toString(answer));
    }

}
