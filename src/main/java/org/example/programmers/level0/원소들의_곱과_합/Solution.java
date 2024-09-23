package org.example.programmers.level0.원소들의_곱과_합;

public class Solution {
    int solution(int num_list[]) {
        int answer = 0;
        long multiply = num_list[0];
        long sum = 0;
        for (int i = 1; i < num_list.length; i++) {
            multiply *= num_list[i];
        }
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        long sumPow = sum * sum;
        if (multiply < sumPow) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
