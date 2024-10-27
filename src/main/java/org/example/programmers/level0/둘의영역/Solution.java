package org.example.programmers.level0.둘의영역;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    int[] answer;
    for(int i=0; i< arr.length; i++){
        if(arr[i]==2){
            list.add(i);
        }
    }
    if(!list.isEmpty()){
        int s = list.get(0);
        int e = list.get(list.size()-1);
        answer = Arrays.copyOfRange(arr,s,e+1); //기존 배열을 잘라 새로운 배열을 만듬 (from산입, to불산입)
        return answer;
    }
    answer = new int[]{-1};
    return answer;
    }
}
