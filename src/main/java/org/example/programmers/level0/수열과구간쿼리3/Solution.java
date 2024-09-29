package org.example.programmers.level0.수열과구간쿼리3;

import java.util.Arrays;

public class Solution {
    //queries[][] 2라면 의미가 arr 상의 2 값이 아니라 arr[2]라는 것임을 인지!
    public int[] solution(int[] arr, int[][] queries) {
        int temp;
        for(int i =0; i< queries.length; i++){
            temp = arr[queries[i][1]];
            arr[queries[i][1]] = arr[queries[i][0]];
            arr[queries[i][0]] = temp;
        }
        return arr;
    }

}

class Main{

    public static void main(String[] args) {
        int[] arr = {2,4,3,0,1};
        int[][] queries = {{1,0},{4,3},{1,4}};
        Solution sol = new Solution();
        int[] answer = sol.solution(arr,queries);
        System.out.println(Arrays.toString(answer));
    }
}
