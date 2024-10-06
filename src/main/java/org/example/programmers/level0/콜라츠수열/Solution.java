package org.example.programmers.level0.콜라츠수열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        while(n != 1){
            list.add(n);
            if(n%2 == 0){
                n = n/2;
            }else{
                n = 3*n+1;
            }
        }
        list.add(1);
        answer = new int[list.size()];
        for(int i =0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

}
class main{

    public static void main(String[] args) {
        int n = 10;
        Solution sol = new Solution();
        int[] answer = sol.solution(n);
        System.out.println(Arrays.toString(answer));
    }
}
