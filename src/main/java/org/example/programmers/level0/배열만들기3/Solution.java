package org.example.programmers.level0.배열만들기3;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            for(int j =s; j<=e; j++){
                list.add(arr[j]);
            }
        }
        int [] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]= list.get(i);
        }
        return answer;
    }

}
