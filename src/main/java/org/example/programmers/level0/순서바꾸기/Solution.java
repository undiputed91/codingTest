package org.example.programmers.level0.순서바꾸기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int[] arr1 = Arrays.copyOfRange(num_list,0,n);
        int[] arr2 = Arrays.copyOfRange(num_list,n,num_list.length);
        int temp =0;
        for(int i=0; i< arr2.length;i++){
            answer[temp++] = arr2[i];
        }
        for(int i=0; i<arr1.length; i++){
            answer[temp++] = arr1[i];
        }
        return answer;
    }

}
