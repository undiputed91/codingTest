package org.example.programmers.level0.수열과구간쿼리2;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i =0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            ArrayList<Integer> list = new ArrayList<>();
            for(int j =s; j<= e; j++){
                if(arr[j]>k){
                    list.add(arr[j]);
                }
            }
            if(list.isEmpty()){
                answer[i] = -1;
            }else{
                answer[i] = Collections.min(list);
            }

        }
        return answer;
    }
}

class Main{

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] answer = solution.solution(arr, queries);

        System.out.println(Arrays.toString(answer));
    }
}