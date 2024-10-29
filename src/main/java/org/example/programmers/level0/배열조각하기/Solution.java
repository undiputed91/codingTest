package org.example.programmers.level0.배열조각하기;


import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static int[] solution(int[] arr, int[] query) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            int index = query[i];

            if (i % 2 == 0) {
                for (int j = list.size() - 1; j > index; j--) {
                    list.remove(j);
                }
            } else {
                for (int j = 0; j < index; j++) {
                    list.remove(0);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

class Main{

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        int[] answer = sol.solution(arr,query);
        System.out.println(Arrays.toString(answer));
    }
}

// public int[] solution(int[] arr, int[] query) {
//
//        for(int i=0; i<query.length; i++){
//            if(i%2 ==0){
//                arr = Arrays.copyOfRange(arr,0,query[i]+1);
//            }else{
//                arr = Arrays.copyOfRange(arr,query[i],arr.length);
//            }
//        }
//        return arr;
//    }