package org.example.programmers.level0.조건에맞게수열변환하기1_stream연습;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr)
            .map(x -> {
                if (x >= 50 && x % 2 == 0) {
                    return x / 2;
                } else if (x < 50 && x % 2 != 0) {
                    return x * 2;
                } else {
                    return x;
                }
            })
            .toArray();
        return answer;
    }
}
